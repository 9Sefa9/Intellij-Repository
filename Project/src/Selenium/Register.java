package Selenium;

public abstract class Register implements IMessengram{

    abstract void register(String phoneNumber, String fullName, String userName, String password);
    abstract void register(SocialNetwork facebook);
}
