package MoodleConnector;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;
import org.apache.commons.logging.LogFactory;

import java.util.Scanner;
import java.util.logging.Level;

public class Login extends Container  implements Connectable {

    final protected WebClient webClient;
    protected HtmlPage page;

    public Login() {
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
    public void loginToWebsite(String username, String password) throws Exception {
        final HtmlForm form = page.getFirstByXPath("//form[@action='https://moodle.uni-due.de/login/index.php']");
        final HtmlSubmitInput submitbutton = form.getFirstByXPath("//input[@id='loginbtn']");
        final HtmlTextInput usernameField = form.getFirstByXPath("//input[@name='username']");
        final HtmlPasswordInput passwordField = form.getFirstByXPath("//input[@name='password']");

        System.out.println("Logging in...");

        usernameField.setText(username);
        passwordField.setText(password);

        System.out.println("Logged in!");
        page = submitbutton.click();
        windowTitle();

        Analysis analyze = new Analysis(page);
        analyze.content("https://moodle.uni-due.de/course/view.php?id=");
    }
    @Override
    public int userAction() {
        return super.userAction();
    }

    public void windowTitle() {
        System.out.println("Window Title: " + page.getTitleText());
    }

    public void close() {
        webClient.close();
    }

    public void ignoreLogs() {
        LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");

        java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.commons.httpclient").setLevel(Level.OFF);

    }
}
