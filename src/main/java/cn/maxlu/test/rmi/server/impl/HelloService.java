package cn.maxlu.test.rmi.server.impl;

import cn.maxlu.test.rmi.common.IHelloService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloService extends UnicastRemoteObject implements IHelloService {

    public HelloService() throws RemoteException {
    }

    @Override
    public String sayHello(String name)  throws RemoteException{
        return "hello " + name;
    }
}
