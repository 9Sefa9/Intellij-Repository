package imgur;

public class ProxyImage implements Subject {
    RealImage realImage;
    public ProxyImage(String path, int width, int height){
      realImage = new RealImage(path,width,height);
    }
    @Override
    public void createImg() {
        realImage.createImg();
    }
    public void createBarcode(){
        realImage.createBarcode();
    }
}
