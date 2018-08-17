package cn.maxlu.test.proxy.dynamic.jdk;

public class Main {
    public static void main(String[] args) {
        EchoServiceImpl echoService = new EchoServiceImpl();
        IEchoService proxy = (IEchoService) new ProxyFactory(echoService).getProxy();
        proxy.echo();
    }
}
