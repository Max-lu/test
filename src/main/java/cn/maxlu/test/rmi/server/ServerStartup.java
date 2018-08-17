package cn.maxlu.test.rmi.server;

import cn.maxlu.test.rmi.common.IHelloService;
import cn.maxlu.test.rmi.server.impl.HelloService;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServerStartup {
    public static void main(String[] args) {
        try {
            IHelloService helloService = new HelloService();
            LocateRegistry.createRegistry(8080);
            Naming.bind("rmi://127.0.0.1:8080/test", helloService);
        } catch (RemoteException | MalformedURLException | AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
