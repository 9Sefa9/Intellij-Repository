package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
//enthält implementierungen
public class DatenContainer extends UnicastRemoteObject implements Schnittstelle{


    public DatenContainer() throws RemoteException {
    }

    @Override
    public int ggt(int a, int b) throws RemoteException{
        if(b == 0)
            return a;
        else return ggt(b,a%b);
    }
}
