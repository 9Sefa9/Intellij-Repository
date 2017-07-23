package Networking;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;

public class HttpUrlConnection {

    public static void submittingForm() throws Exception {
       WebClient webClient = new WebClient();

        HtmlPage page1 = webClient.getPage("https://moodle.uni-due.de/login/");
       System.out.println(page1.asXml());
        HtmlForm form = page1.getFormByName("body");
        //HtmlInput input1 = page1.getBody().ge
   //     input1.setValueAttribute("yarn");

   //     HtmlSubmitInput submit1 = page1.getElementByName("btnG");

   //     page1=submit1.click();

//        System.out.println(page1.asXml());

        webClient.close();
    }
    public static void main(String[] a) throws Exception{
       submittingForm();
    }
}