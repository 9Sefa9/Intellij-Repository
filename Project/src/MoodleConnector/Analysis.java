package MoodleConnector;

import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlListItem;
import com.gargoylesoftware.htmlunit.html.HtmlListing;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.sun.java.swing.plaf.windows.resources.windows;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Analysis extends Container{
    protected HtmlPage page;
    protected int decision;

    public Analysis(HtmlPage page){
        this.page = page;
    }

    //show all course titles. and store them for access..
    public void content(String href) throws InterruptedException {
        super.anchors = new ArrayList<>();
        System.out.println("===================================CONTENT===================================");
        for (int i = 0; i < 700000; i++) {
            try {
                HtmlAnchor anchor = page.getAnchorByHref(href + i);
                if (anchor.isDisplayed())
                    super.anchors.add(anchor);
                else continue;
            } catch (ElementNotFoundException | NullPointerException e) {
                continue;
            }
        }
        System.out.println(super.anchors.size());
        for (int i = 0; i < super.anchors.size()-1; i++) {
            if(!super.anchors.get(i).getAttribute("title").isEmpty())
            System.out.println(i + "." + super.anchors.get(i).getAttribute("title"));

            else{
                try {
                    HtmlListItem li = page.getFirstByXPath("//li[@id='section-" + i + "']");

                    System.out.println(i + "." + li.getAttribute("aria-label"));
                }catch (NullPointerException e ){
                    continue;
                }
                }
        }

        this.decision = userAction();
        System.out.println("SELECTED:  " + super.anchors.get(this.decision).getAttribute("title"));
        click(super.anchors.get(this.decision));
        System.out.println(super.anchors.get(this.decision).getHrefAttribute());
        content("https://moodle.uni-due.de/mod/resource/view.php?id=");

    }
    public void downloadPDF(String href){
        try {

        }catch(Exception e){
            e.printStackTrace();
        }

        }
    public void click(HtmlAnchor course){
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

        //select randomly a href from the courselist to determine which Type the Website is.
        System.out.println(super.anchors.get(super.anchors.size()-1).getHrefAttribute());
        if(super.anchors.get(super.anchors.size()-1).getHrefAttribute().contains("resource")) {
            System.out.println("Type: Resource");
            for (int i = 0; i < 1000000; i++) {
                try {
                    HtmlAnchor anchor = page.getAnchorByHref("https://moodle.uni-due.de/mod/resource/view.php?id=" + i);
                    if (anchor.isDisplayed()) {
                        super.anchors.add(anchor);
                    } else {
                        continue;
                    }
                } catch (ElementNotFoundException e) {
                    continue;
                }
            }try {
                content("https://moodle.uni-due.de/mod/resource/view.php?id=");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(super.anchors.get(super.anchors.size()-1).getHrefAttribute().contains("assign")){
            super.anchors= new ArrayList<>();

            for (int i = 0; i < 1000000; i++) {
                try {
                    HtmlAnchor anchor = page.getAnchorByHref("https://moodle.uni-due.de/mod/assign/view.php?id=" + i);
                    if (anchor.isDisplayed()) {
                        super.anchors.add(anchor);
                    } else {
                        continue;
                    }
                } catch (ElementNotFoundException e) {
                    continue;
                }
            }try {
                content("https://moodle.uni-due.de/mod/assign/view.php?id=");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public void windowTitle(){
        System.out.println("Window Title: "+page.getTitleText());
    }

    @Override
    public int userAction(){
        Scanner eingabe = new Scanner(System.in);
        System.out.print("::=> ");
        int s = eingabe.nextInt();
        return s;
    }
}
