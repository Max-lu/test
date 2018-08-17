package cn.maxlu.test.proxy.staticc;

public class Main {
    public static void main(String[] args) {
        EchoServiceImpl echoService = new EchoServiceImpl();
        EchoServiceProxy proxy = new EchoServiceProxy(echoService);
        proxy.echo();
    }
}
