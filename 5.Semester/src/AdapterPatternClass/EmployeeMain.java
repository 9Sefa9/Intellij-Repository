package AdapterPatternClass;

import AdapterPatternObject.EmployeeAdapter;

public class EmployeeMain {
    public static void main(String[] args){
        EmployeeAdapter ea = new EmployeeAdapter("Sefa","Gövercin");
        System.out.println(ea.getFullName());
    }
}
