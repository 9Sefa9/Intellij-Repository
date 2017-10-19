package AdapterPatternClass;


public class EmployeeAdapter extends AdapterPatternClass.Employee implements AdapterPatternClass.MyEmployeeInterface {

    String fullName;
    public EmployeeAdapter(String firstName, String lastName){
        this.firstName = super.getFirstName();
        this.lastName = super.getLastName();
    }
    @Override
    public String getFullName(){

        return this.fullName;
    }

}
