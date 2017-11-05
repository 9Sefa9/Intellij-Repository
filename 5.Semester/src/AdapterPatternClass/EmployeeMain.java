package AdapterPatternClass;


public class EmployeeMain {
    public static void main(String[] args){
        EmployeeAdapter employee = new EmployeeAdapter("Sefa","Gövercin");
        System.out.println(employee);
    }
}
