package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client{

    public static void main(String[] arg) throws RemoteException, NotBoundException, MalformedURLException {

        //erstellt Objekt mithilfe des Objekts aus dem Server
        // POLYMORPHISMUS !! Säugetier fido = new Hund();

        Schnittstelle s = (Schnittstelle)Naming.lookup("//localhost:1099/hallo");
        System.out.println(s.ggt(6,12));
    }

}
