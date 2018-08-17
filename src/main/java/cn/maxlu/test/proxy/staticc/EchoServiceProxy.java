package cn.maxlu.test.proxy.staticc;

public class EchoServiceProxy implements IEchoService {

    private IEchoService target;

    public EchoServiceProxy(IEchoService target) {
        this.target = target;
    }

    @Override
    public void echo() {
        System.out.println("proxy to target");
        this.target.echo();
    }
}
