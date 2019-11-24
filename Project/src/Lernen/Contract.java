package Lernen;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Contract extends Remote {

     void sayHello() throws RemoteException;
}
