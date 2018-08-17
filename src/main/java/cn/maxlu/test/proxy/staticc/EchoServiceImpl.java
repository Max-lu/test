package cn.maxlu.test.proxy.staticc;

public class EchoServiceImpl implements IEchoService {
    @Override
    public void echo() {
        System.out.println("hello world");
    }
}
