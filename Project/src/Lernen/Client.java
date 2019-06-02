package Lernen;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public Client(){
        try {
            Contract con = (Contract)Naming.lookup("//localhost:2345/servlet");
            con.sayHello();
        } catch (NotBoundException| MalformedURLException|RemoteException e) {
            e.printStackTrace();
        }
    }
}
