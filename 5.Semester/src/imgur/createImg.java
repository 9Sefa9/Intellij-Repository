package imgur;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.*;

public class createImg {
    public static void main(String[] args){
        new createImg("G:/Users/Progamer/Desktop/test",500,500);
    }
    private String path;
    private int width,height;
    public createImg(String path, int width, int height){
        this.path = path;
        this.width = width;
        this.height = height;

    }
    public void createImage(){
        BufferedImage bi = null;
        File f= null;
        try{
            bi = new BufferedImage(width,height, BufferedImage.TYPE_INT_ARGB);
            f = new File(this.path);

            int p = (23<<24) | (24<<16) | (25<<8) | 26; //pixel
            for(int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    bi.setRGB(x, y, p);
                }
            }
            //write image:
            ImageIO.write(bi,".png",f);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
