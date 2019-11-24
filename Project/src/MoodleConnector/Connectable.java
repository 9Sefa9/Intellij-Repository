package MoodleConnector;

public interface Connectable {
    public void createWebsite(String loginpage) throws Exception;
    public void loginToWebsite(String username,String password) throws Exception;
}
