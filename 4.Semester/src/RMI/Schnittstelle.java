package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Schnittstelle extends Remote {

    public int ggt(int a, int b) throws RemoteException;
}
