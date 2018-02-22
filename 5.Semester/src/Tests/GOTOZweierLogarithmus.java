package Tests;

public class GOTOZweierLogarithmus {
    public static void main(String[] args){
       int x1 = 20;
        int x2 = 1;
       int x3 = 0;
       for(int i = 0 ; i<=x1; i++){
           int x4 = (x2+1)-x1;
           if(x4 == 0){
               x2 = 2*x2;
               x3 = x3+1;
           }
       }
       System.out.println(x3);
    }
}
