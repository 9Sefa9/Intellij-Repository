package imgur;
/*
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Random;

public class RealImage implements Subject {
    String path;
    int width, height;
    public RealImage(String path, int width, int height){
        this.path = path;
        this.width = width;
        this.height = height;
    }
    @Override
    public void createImg(){
        BufferedImage bi = null;
        FileOutputStream f= null;
        try{
            bi = new BufferedImage(width,height, BufferedImage.TYPE_INT_ARGB);

            for(int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                        bi.setRGB(x, y, new Random().nextInt());
                }
            }
            //write image:
            f = new FileOutputStream("G:/Users/Progamer/Desktop/hi.png");
            ImageIO.write(bi,"png",f);
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(f!=null)
                    f.close();
            }catch(Exception e ){
                e.printStackTrace();
            }
        }

    }
    public void createBarcode(){
        String text = "a"; // this is the text that we want to encode

        int width = this.width;
        int height = this.height; // change the height and width as per your requirement

        // (ImageIO.getWriterFormatNames() returns a list of supported formats)
        String imageFormat = "png"; // could be "gif", "tiff", "jpeg"

        BitMatrix bitMatrix = null;
        try {

            bitMatrix = new QRCodeWriter().encode(text, BarcodeFormat.QR_CODE, width, height);
            MatrixToImageWriter.writeToStream(bitMatrix, imageFormat, new FileOutputStream(new File("G:/Users/Progamer/Desktop/barcode.png")));
        } catch (WriterException | IOException e) {
            e.printStackTrace();
        }finally{
            try{
                if(bitMatrix!=null)
                    bitMatrix.clear();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
*/