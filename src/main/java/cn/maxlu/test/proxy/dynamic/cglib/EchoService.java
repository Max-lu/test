package cn.maxlu.test.proxy.dynamic.cglib;

public class EchoService {
    public void echo() {
        System.out.println("hello world");
    }

    public final void finalEcho() {
        System.out.println("hello world (final)");
    }

    public static void staticEcho() {
        System.out.println("hello world (static)");
    }
}
