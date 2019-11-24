package RMI;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class Server{

    public static void main(String[] arg) throws RemoteException, MalformedURLException {

        //erstelle Objekt im Server und warte auf eingehende verbindung
        LocateRegistry.createRegistry(1099);
        Remote einObjekt = new DatenContainer();
        Naming.rebind("//localhost:1099/hallo",einObjekt);

    }
}
