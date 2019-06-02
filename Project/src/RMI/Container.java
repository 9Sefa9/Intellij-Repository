package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Container extends UnicastRemoteObject implements RMIInterface {

    public Container() throws RemoteException{

    }
    @Override
    public int ggt(int a, int b)throws RemoteException{
      if(b == 0){
          return a;
      }else return ggt(b,a%b);
    }

}
