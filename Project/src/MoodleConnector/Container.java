package MoodleConnector;

import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.util.ArrayList;
import java.util.Scanner;

public class Container {
    protected ArrayList<HtmlPage> pages = new ArrayList<>();
    protected ArrayList<HtmlAnchor> anchors = new ArrayList<>();

    protected int userAction(){
        Scanner eingabe = new Scanner(System.in);
        System.out.print("::=> ");
        int s = eingabe.nextInt();
        return s;
    }
}
