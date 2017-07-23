package Networking;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;

public class MoodleConnector {

    final protected WebClient webClient;
    protected HtmlPage page;

    public MoodleConnector(){
        //create browser
        ignoreLogs();
        webClient = new WebClient(BrowserVersion.CHROME);
    }

    //create Website
    public void createWebsite(String loginpage) throws Exception {
        page = webClient.getPage(loginpage);
        windowTitle();
    }
    //login to Website
    public void loginToWebsite(String username,String password) throws Exception{
        final HtmlForm form = page.getFirstByXPath("//form[@action='https://moodle.uni-due.de/login/index.php']");
        final HtmlSubmitInput submitbutton = form.getFirstByXPath("//input[@id='loginbtn']");
        final HtmlTextInput usernameField =form.getFirstByXPath("//input[@name='username']");
        final HtmlPasswordInput passwordField =form.getFirstByXPath("//input[@name='password']");

        System.out.println("Logging in...");

        usernameField.setText(username);
        passwordField.setText(password);

        System.out.println("Logged in!");
        page = (HtmlPage)submitbutton.click();
        windowTitle();

        listAllCourses();

    }
    //show all course titles. and store them to access..
    public void listAllCourses() throws InterruptedException {
        System.out.println("===================================COURSES===================================");
        ArrayList<HtmlAnchor> allCourses = new ArrayList();
        for(int i = 0;i<= 20000; i++) {
            try {
                HtmlAnchor anchor = page.getAnchorByHref("https://moodle.uni-due.de/course/view.php?id=" + i);

                if(anchor.isDisplayed()){
                    allCourses.add(anchor);
                }
                else{
                    continue;
                }
            }catch(ElementNotFoundException e){
                continue;
            }
        }
        for(int i= 0; i<allCourses.size(); i++){
            System.out.println(i+"."+allCourses.get(i).getAttribute("title"));
        }
        int dec = decision();

        Thread.sleep(1000);
        System.out.println("SELECTED:  "+allCourses.get(dec).getAttribute("title"));
        selectCourse(allCourses.get(dec));


    }
    public void selectCourse(HtmlAnchor course){
        try {
            page = course.click();
            windowTitle();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public int decision(){
        Scanner eingabe = new Scanner(System.in);
        System.out.print("::=> ");
        return eingabe.nextInt();
    }
    public void windowTitle(){
        System.out.println("Window Title: "+page.getTitleText());
    }
    public void close(){
        webClient.close();
    }
    public void ignoreLogs() {
        LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");

        java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.commons.httpclient").setLevel(Level.OFF);

    }

}