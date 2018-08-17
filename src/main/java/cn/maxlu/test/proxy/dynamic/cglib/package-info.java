/**
 * cglib动态代理
 * 使用字节码技术生成被代理类的子类
 * 所以不需要被代理类实现接口
 * 被代理类不能是final的 (java.lang.IllegalArgumentException: Cannot subclass final class cn.maxlu.test.proxy.dynamic.cglib.EchoService)
 * 被代理类的方法如果为final/static,那么就不会被拦截,即不会执行目标对象额外的业务方法.
 */
package cn.maxlu.test.proxy.dynamic.cglib;