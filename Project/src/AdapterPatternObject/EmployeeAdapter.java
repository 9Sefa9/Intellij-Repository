package AdapterPatternObject;

public class EmployeeAdapter implements MyEmployeeInterface {

    Employee employee;
    String firstName;
    String lastName;
    public EmployeeAdapter(String firstName, String lastName){
        employee = new Employee(firstName,lastName);
        this.firstName = employee.getFirstName();
        this.lastName = employee.getLastName();
    }
    @Override
    public String getFullName(){
        return this.firstName+" "+this.lastName;
    }

}
