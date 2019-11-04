package Tests;

import RMI.RMIInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Locale;

public class RMIClient {
    public static void main(String[]ar){
        new RMIClient();
    }
    public RMIClient(){
        try {
            RMIInterface intf =(RMIInterface)Naming.lookup("//127.0.0.1:3121/echo");
            System.out.println(intf.ggt(12,6));

        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
