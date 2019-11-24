package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServerClass {
    public static void main(String[] args) throws RemoteException,MalformedURLException{
        LocateRegistry.createRegistry(5050);
        Remote rem = new Container();
        Naming.rebind("//127.0.0.1:5050/derbesteserver",rem);
    }
}
