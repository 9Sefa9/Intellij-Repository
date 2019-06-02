package Tests;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Locale;

public class RMIServer {
    public static void main(String[]ar){
        new RMIServer();
    }
    public RMIServer(){
        try {
            LocateRegistry.createRegistry(3121);
            Remote obj = new RMIContainer();
            Naming.rebind("//127.0.0.1:3121/echo",obj);

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
