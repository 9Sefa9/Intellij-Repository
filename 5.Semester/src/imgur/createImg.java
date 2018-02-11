package imgur;

import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;
import javax.imageio.*;

public class createImg {
    public static void main(String[] args){
      createImg t =  new createImg("G:/Users/Progamer/Desktop/hi.txt",1920 ,1080);
        t.encrypt();
        t.decrypt();
        System.out.println("done");
    }
    private String path;
    private int width,height;
    public createImg(String path, int width, int height){
        this.path = path;
        this.width = width;
        this.height = height;

    }

    public void encrypt(){
        DataInputStream dis = null;
        BufferedImage bi = null;
        ByteArrayOutputStream byteArr = null;
        FileOutputStream f= null;
        try{
            bi = new BufferedImage(width,height, BufferedImage.TYPE_INT_ARGB);
            dis = new DataInputStream(new FileInputStream(this.path));
            byteArr = new ByteArrayOutputStream();

            int temp;
            System.out.println((int)new FileInputStream(this.path).getChannel().size());
            byte []buf2 =new byte[(int)new FileInputStream(this.path).getChannel().size()];
            while((temp=dis.read(buf2,0,buf2.length))!= -1)
                    byteArr.write(buf2,0,temp);

            byteArr.flush();
            byte[] ff = byteArr.toByteArray();

            for(int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++){
                    if(x<ff.length)
                    bi.setRGB(x,y,ff[x]);
                }
            }
            //write image:
            f = new FileOutputStream("G:/Users/Progamer/Desktop/hiENCRYPT.png");
            ImageIO.write(bi,"png",f);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void decrypt(){
        DataInputStream dis= null;
        BufferedImage bi = null;
        try {
            Scanner s = new Scanner(System.in);
            s.nextLine();
            dis = new DataInputStream(new FileInputStream("G:/Users/Progamer/Desktop/hiENCRYPT.png"));
            bi = ImageIO.read(dis);


            byte[] bufNew = new byte[(int)new FileInputStream("G:/Users/Progamer/Desktop/hiENCRYPT.png").getChannel().size()];
            for(int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {

                    bufNew[x]= (byte)bi.getRGB(x,y);
                }
            }


           FileOutputStream fos = new FileOutputStream("G:/Users/Progamer/Desktop/hiDECRYPTED.txt");
            fos.write(bufNew);
            fos.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
