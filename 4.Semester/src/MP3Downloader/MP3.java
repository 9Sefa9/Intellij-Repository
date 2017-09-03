package MP3Downloader;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebResponse;
import com.gargoylesoftware.htmlunit.html.*;
import com.gargoylesoftware.htmlunit.javascript.host.html.HTMLSelectElement;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.html.HTMLOptionElement;

import java.io.*;
import java.util.logging.Level;

public class MP3 implements Runnable{
    private String urlYoutube,path,name;
    final private WebClient webClient;
    private HtmlPage converterPage,ytpage;

    public MP3(String urlYoutube,String path, String name){
        this.urlYoutube = urlYoutube;
        this.name= name;
        this.path = path;

        //create browser
        ignoreLogs();
        webClient = new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setUseInsecureSSL(true);
        webClient.getOptions().setJavaScriptEnabled(true);
    }
    public MP3(String urlYoutube){
        this.urlYoutube = urlYoutube;
        //create browser
        ignoreLogs();
        webClient = new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setUseInsecureSSL(true);
        webClient.getOptions().setRedirectEnabled(true);
        webClient.getOptions().setJavaScriptEnabled(false);
    }
    public MP3(){
        //create browser
        ignoreLogs();
        webClient = new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setUseInsecureSSL(true);
        webClient.getOptions().setRedirectEnabled(true);
        webClient.getOptions().setJavaScriptEnabled(false);
    }

    //create Websiteframe
    public void createWebsite() throws Exception {
        converterPage = webClient.getPage("http://convert2mp3.net/");
        windowTitle();
    }
    /*
    public String determineAuthorFrom(String ytblink) throws Exception{
        createWebsite();
        final HtmlForm form = converterPage.getFirstByXPath("//form[@action='index.php?p=convert']");
        final HtmlTextInput urlField = form.getFirstByXPath("//input[@name='url']");
        final HtmlButton convertButton= form.getFirstByXPath("//button[@type='submit']");
        urlField.setText(ytblink);
        converterPage = convertButton.click();
        String s = converterPage.getFirstChild().getLocalName();
        System.out.println(s);
        return s;
    }
    */
    public void processYoutubeLink(String ytblink) throws IOException, InterruptedException {
        final HtmlForm form = converterPage.getFirstByXPath("//form[@action='index.php?p=convert']");
        final HtmlTextInput urlField = form.getFirstByXPath("//input[@name='url']");
        final HtmlButton convertButton= form.getFirstByXPath("//button[@type='submit']");
        System.out.println("Accessing Youtube link...");
        urlField.setText(ytblink);
        System.out.println("Converting to mp3...");
        System.out.println("Preparing mp3 file for download...");
        converterPage = convertButton.click();

        windowTitle();

        final HtmlAnchor continueButton = converterPage.getFirstByXPath("//a[@class='btn']");
        converterPage = continueButton.click();

        windowTitle();

    }
    public void downloadMp3FromServer() throws IOException {

        HtmlAnchor downloadAnchor = converterPage.getFirstByXPath("//a[@class='btn btn-success btn-large']");
        InputStream reader = null;
        OutputStream os = null;

        try {
            reader = downloadAnchor.click().getWebResponse().getContentAsStream();
            os = new FileOutputStream(this.path+"/"+this.name);

            byte[] buffer = new byte[8192];
            int read;
            while((read = reader.read(buffer)) != -1){
                os.write(buffer,0,read);
           }
            System.out.println("Download done! Please check your path.");

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
        System.out.println("Window Url: " + this.converterPage.getUrl());
    }

    @Override
    public void run(){
        try {
            createWebsite();
            processYoutubeLink(this.urlYoutube);
            downloadMp3FromServer();

        }catch(Exception e){
            e.printStackTrace();
        }
        }
}
