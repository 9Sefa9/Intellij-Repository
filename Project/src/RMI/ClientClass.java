package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientClass {
    public static void main(String[] args) throws MalformedURLException,RemoteException, NotBoundException{

        RMIInterface clk = (RMIInterface) Naming.lookup("//127.0.0.1:5050/derbesteserver");
        System.out.println(clk.ggt(3,10));
    }
}
