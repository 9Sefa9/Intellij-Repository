package Networking;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;
import org.apache.commons.logging.LogFactory;

import java.util.List;
import java.util.logging.Level;

public class HttpUrlConnection {

    public void submittingForm() throws Exception {

        ignoreLogs();

        final WebClient webClient = new WebClient(BrowserVersion.CHROME);

        HtmlPage page1 = webClient.getPage("https://moodle.uni-due.de/login/");
        System.out.println(page1.getTitleText());
        HtmlElement body = page1.getBody();
        final HtmlDivision div = (HtmlDivision)page1.getElementById("loginpanel");

        final List<?> form = page1.getForms();//getFormByName("login");

        for(Object i: form)
            System.out.println(i);

        final HtmlForm form2 = page1.getFirstByXPath("//form[@action='https://moodle.uni-due.de/login/index.php']");
        final HtmlSubmitInput submitbutton = form2.getFirstByXPath("//input[@id='loginbtn']");
        final HtmlTextInput usernameField =form2.getFirstByXPath("//input[@name='username']");
        final HtmlTextInput passwordField =form2.getFirstByXPath("//input[@name='password']");

        usernameField.setValueAttribute("sjsagoev");
        passwordField.setValueAttribute("diabolo31213");

        submitbutton.click();
        webClient.close();
    }

    public void ignoreLogs() {
        LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");

        java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.commons.httpclient").setLevel(Level.OFF);

    }

    public static void main(String[] a) throws Exception {
        HttpUrlConnection url = new HttpUrlConnection();
        url.submittingForm();
    }
}