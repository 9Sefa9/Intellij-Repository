package DatabankStrategies;

public interface DatabankStrategy {

     void setupDriver();
     void setupConnection();
     void query();
     void fetch();
}
