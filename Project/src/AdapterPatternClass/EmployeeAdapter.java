package AdapterPatternClass;


public class EmployeeAdapter implements MyEmployeeInterface {
    Employee e;
    String firstName,lastName;

    public EmployeeAdapter(){

        this.firstName = e.getFirstName();
        this.lastName = e.getLastName();
    }

    @Override
    public String getFullName(){
        return this.firstName+" "+this.lastName;
    }
    @Override
    public String toString(){
        return getFullName();
    }

}
