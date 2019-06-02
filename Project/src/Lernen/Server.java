package Lernen;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Locale;

public class Server implements Contract{

    public Server(){
        try {
            LocateRegistry.createRegistry(2345);
            Remote remote = new Container();
            Naming.rebind("//localhost:2345/servlet",remote);

        }catch(RemoteException|MalformedURLException r){
            r.printStackTrace();
        }
    }

    @Override
    public void sayHello() {

    }
}
