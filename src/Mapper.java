import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;

public class Mapper implements iMapper{
    @Override
    public iMapper createMapTask(String name) throws RemoteException, AlreadyBoundException {
        return null;
    }

    @Override
    public void processInput(String input, iMaster theMaster) throws RemoteException, AlreadyBoundException {

    }
}
