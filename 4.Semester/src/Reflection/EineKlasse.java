package Reflection;

public class EineKlasse {
    public  int rad;
    public String Hakan;

    public EineKlasse(String Hakan){
        this.Hakan = Hakan;
    }

    public EineKlasse(){

    }
    public int getRad(){
        return this.rad;
    }
    public void setRad(int rad){
        this.rad = rad;
    }
    public String toString(){
        return this.Hakan;
    }
}
