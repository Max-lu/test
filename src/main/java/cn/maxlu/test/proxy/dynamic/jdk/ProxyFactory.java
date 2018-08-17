package cn.maxlu.test.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        Class<?> targetClass = target.getClass();
        ClassLoader classLoader = targetClass.getClassLoader();
        Class<?>[] interfaces = targetClass.getInterfaces();

        return Proxy.newProxyInstance(classLoader, interfaces, (proxy, method, args) -> {
            System.out.println("proxy start");
            Object result = method.invoke(target, args);
            System.out.println("proxy end");
            return result;
        });
    }
}
