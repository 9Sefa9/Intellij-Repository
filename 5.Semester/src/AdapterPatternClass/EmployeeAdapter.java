package AdapterPatternClass;


public class EmployeeAdapter extends Employee implements MyEmployeeInterface {

    String firstName,lastName;

    public EmployeeAdapter(String firstName, String lastName){
        super(firstName,lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFullName(){

        return this.firstName+this.lastName;
    }

}
