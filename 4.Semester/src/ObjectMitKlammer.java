//Kapitel: Anonyme Klassen
public class ObjectMitKlammer {
    public static void main(String[] args){
        obj j = new obj("Sefa"){
           public void syso(){
               System.out.println("hi");
           }
        };
        //geprintet wird hi, weil es überschrieben wird
        j.syso();
    }


}
class obj{
    private String s = "hallo str";
    public obj(String str){
        this.s = str;
    }
    public void syso(){
        System.out.println(s);
    }
}