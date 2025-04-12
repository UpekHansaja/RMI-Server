package lk.jiat.rmi;

import lk.jiat.rmi.client.Msg;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MsgImpl extends UnicastRemoteObject implements Msg {

    MsgImpl() throws RemoteException {
        super();
    }

    @Override
    public String hello(String name) throws RemoteException {
        return "Hello " + name + "!";
    }
}
