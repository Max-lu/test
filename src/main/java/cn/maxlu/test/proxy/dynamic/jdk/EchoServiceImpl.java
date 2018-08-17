package cn.maxlu.test.proxy.dynamic.jdk;

public class EchoServiceImpl implements IEchoService {
    @Override
    public void echo() {
        System.out.println("hello world");
    }
}
