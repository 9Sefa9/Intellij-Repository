package MP3Downloader;

import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.*;

public class Model {
    //attached to paste
    public void ctrlv(TextField urlfield){
        urlfield.setText(null);
        urlfield.paste();

        if(!urlfield.getText().startsWith("https://www.youtube")) {
            urlfield.setText(null);
            urlfield.setPromptText("Copied URL is not a valid Youtube link !");
        }
    }
    public void setUrlToList(String url,ListView<String> downloadList){
        if(!url.isEmpty() && url != null && url.startsWith("https://www.youtube"))
          downloadList.getItems().add(url);
    }
    public void savePath(){

    }
}
