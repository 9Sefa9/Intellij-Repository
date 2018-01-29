package DatabankStrategies;

public class Main {
        //JDBC MUSS VORHER EINGESTELLT WERDEN: DRIVER IS MISSING
    public static void main(String[] args){
        DatabankStrategy ds = new JDBC();
        ds.setupDriver();
        ds.setupConnection();
        ds.fetch();
    }
}
