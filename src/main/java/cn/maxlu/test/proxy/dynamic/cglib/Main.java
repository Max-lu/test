package cn.maxlu.test.proxy.dynamic.cglib;

public class Main {
    public static void main(String[] args) {
        EchoService echoService = new EchoService();
        EchoService proxy = (EchoService) new ProxyFactory(echoService).getProxy();
        proxy.echo();
        proxy.finalEcho();
        proxy.staticEcho();
    }
}
