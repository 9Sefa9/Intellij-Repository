package MoodleConnector;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.util.ArrayList;

public class MoodleCourseAnalyzer {
    protected HtmlPage page;
    protected int decision;
    protected ArrayList<HtmlAnchor> allCourses;

    public MoodleCourseAnalyzer(HtmlPage page,int decision){
        this.page = page;
        this.decision = decision;
        allCourses = new ArrayList();
    }

    //show all course titles. and store them to access..
    public void listAllCourses() throws InterruptedException {
        System.out.println("===================================COURSES===================================");
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

        Thread.sleep(1000);
        System.out.println("SELECTED:  "+allCourses.get(this.decision).getAttribute("title"));
        selectCourse(allCourses.get(this.decision));

    }
    public void selectCourse(HtmlAnchor course){
        try {
            page = course.click();
            windowTitle();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void windowTitle(){
        System.out.println("Window Title: "+page.getTitleText());
    }
}
