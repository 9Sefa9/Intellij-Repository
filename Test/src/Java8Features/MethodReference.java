package Java8Features;
//instead of using an anonymus class, you can use lamda expression and if this calls only one method, use method reference
@FunctionalInterface
interface IReference{
   public void output(String str);

}
public class MethodReference {
    public static void main(String[] args){
        IReference reference = (str)->System.out.println(str);
        IReference reference2 = MethodReference::display;
        reference.output("Hi");
        reference2.output("Hi");
    }

    private static void display(String s) {
        System.out.println(s);
    }

}
