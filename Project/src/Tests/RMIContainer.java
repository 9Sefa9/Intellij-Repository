package Tests;

import RMI.RMIInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIContainer extends UnicastRemoteObject implements RMIInterface{
    public RMIContainer() throws RemoteException {
    }

    @Override
    public int ggt(int a, int b)throws RemoteException
    {
        if (a==b) return(a);
        else
        {
            if (a>b) return(ggt(a-b,b));
            else return(ggt(b-a,a));
        }
    }
}
