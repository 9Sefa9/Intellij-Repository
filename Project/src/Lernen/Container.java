package Lernen;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Container extends UnicastRemoteObject implements Contract{


    public Container() throws RemoteException{

    }
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
