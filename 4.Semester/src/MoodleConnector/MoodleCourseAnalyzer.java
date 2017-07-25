package MoodleConnector;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.util.ArrayList;
import java.util.Scanner;

public class MoodleCourseAnalyzer {
    protected HtmlPage page;
    protected int decision;
    protected ArrayList<HtmlAnchor> allCourses;

    public MoodleCourseAnalyzer(HtmlPage page){
        this.page = page;
        this.decision = decision;
    }

    //show all course titles. and store them for access..
    public void listAllCourses(String href) throws InterruptedException {
        allCourses = new ArrayList<>();
        System.out.println("===================================COURSES===================================");
        for(int i = 0;i< 100000; i++) {
            try{
                HtmlAnchor anchor = page.getAnchorByHref(href + i);
                if(anchor.isDisplayed())
                    allCourses.add(anchor);

                else continue;

            }catch(ElementNotFoundException e){
                continue;
            }
        }
        for(int i= 0; i<allCourses.size(); i++){
            System.out.println(i+"."+allCourses.get(i).getAttribute("title"));
        }

        this.decision = decision();

        System.out.println("SELECTED:  "+allCourses.get(this.decision).getAttribute("title"));
        clickAndNavigateToCourse(allCourses.get(this.decision));
        determineWebsiteType();

    }
    public void clickAndNavigateToCourse(HtmlAnchor course){
        try {
            System.out.println("Click ==>");
            page = course.click();
            windowTitle();
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void determineWebsiteType(){
        //GIBT FALSCHEN LINK RAUS ! ==> IMPROVISIEREN!
        //select randomly a href from the courselist to determine which Type the Website is.
        System.out.println(this.allCourses.get(allCourses.size()-1).getHrefAttribute());
       if(this.allCourses.get(allCourses.size()-1).getHrefAttribute().contains("resource")) {
           System.out.println("Type: Resource");
           for (int i = 0; i < 1000000; i++) {
               try {
                   HtmlAnchor anchor = page.getAnchorByHref("https://moodle.uni-due.de/mod/resource/view.php?id=" + i);
                   if (anchor.isDisplayed()) {
                        allCourses.add(anchor);
                   } else {
                       continue;
                   }
               } catch (ElementNotFoundException e) {
                   continue;
               }
           }try {
               listAllCourses("https://moodle.uni-due.de/mod/resource/view.php?id=");
           }catch(Exception e){
               e.printStackTrace();
           }
       }
       else if(this.allCourses.get(allCourses.size()-1).getHrefAttribute().contains("assign")){
            allCourses = new ArrayList<>();

           for (int i = 0; i < 1000000; i++) {
               try {
                   HtmlAnchor anchor = page.getAnchorByHref("https://moodle.uni-due.de/mod/assign/view.php?id=" + i);
                   if (anchor.isDisplayed()) {
                       allCourses.add(anchor);
                   } else {
                       continue;
                   }
               } catch (ElementNotFoundException e) {
                   continue;
               }
           }try {
               listAllCourses("https://moodle.uni-due.de/mod/assign/view.php?id=");
           }catch(Exception e){
               e.printStackTrace();
           }
       }
    }
    public void windowTitle(){
        System.out.println("Window Title: "+page.getTitleText());
    }
    public int decision(){
        Scanner eingabe = new Scanner(System.in);
        System.out.print("::=> ");
        int s = eingabe.nextInt();
        return s;
    }
}
