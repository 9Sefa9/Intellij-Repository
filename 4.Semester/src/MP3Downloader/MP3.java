package MP3Downloader;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebResponse;
import com.gargoylesoftware.htmlunit.html.*;
import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.apache.commons.logging.LogFactory;

import java.io.*;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;

public class MP3 {
    private String urlYoutube,savepath;
    final private WebClient webClient;
    private HtmlPage page;

    public MP3(String urlYoutube, String savepath){
        this.urlYoutube = urlYoutube;
        this.savepath = savepath;

        //create browser
        ignoreLogs();
        webClient = new WebClient(BrowserVersion.CHROME);

        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.getOptions().setCssEnabled(false);
    }

    //create Websiteframe
    public void createWebsite(String page) throws Exception {
        this.page = webClient.getPage(page);
        windowTitle();
    }
    public void processYoutubeLink() throws IOException, InterruptedException {
        final HtmlForm form = page.getFirstByXPath("//form[@action='index.php?p=convert']");
        final HtmlTextInput urlField = form.getFirstByXPath("//input[@name='url']");
        final HtmlButton convertButton= form.getFirstByXPath("//button[@type='submit']");
        System.out.println("Accessing Youtube link...");
        urlField.setText(this.urlYoutube);
        System.out.println("Converting to mp3...");
        System.out.println("Preparing mp3 file for download...");
        page = convertButton.click();

        windowTitle();

        final HtmlAnchor continueButton = page.getFirstByXPath("//a[@class='btn']");
        page = continueButton.click();

        windowTitle();

    }
    public void downloadMp3FromServer() throws IOException {
        HtmlAnchor downloadAnchor = page.getFirstByXPath("//a[@class='btn btn-success btn-large']");
        InputStream reader = null;
        OutputStream os = null;
        WebResponse response = null;
        HtmlPage downloadSession;
        try {
            reader = downloadAnchor.click().getWebResponse().getContentAsStream();
            os = new FileOutputStream(this.savepath);

            byte[] buffer = new byte[8192];
            int read;
            while((read = reader.read(buffer)) != -1){
                os.write(buffer,0,read);
           }
            System.out.println("Download done! Please check your path: "+this.savepath);

        }catch (Exception i){
                i.printStackTrace();
        }finally{
            try{
                if(reader != null)
                    reader.close();

                if(os != null)
                    os.close();

                }catch(Exception e){
                    e.printStackTrace();
            }
        }

        }

    public void ignoreLogs() {
        LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");

        java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.commons.httpclient").setLevel(Level.OFF);

    }
    public void windowTitle() {
        System.out.println("Window Url: " + this.page.getUrl());
    }
}
