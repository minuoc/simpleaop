package com.simpleaop;

/**
 * @author chenlufeng
 * @date 2021/4/14
 */
public class Client {
    public static void main(String[] args) {
//        HelloService helloService = new JdkDynamicProxy(new HelloServiceImpl()).getProxy();
        HelloService helloService = new CGlibDynamicProxy().getInstance().getProxy(HelloServiceImpl.class);
        helloService.sayHelloWorld();
    }
}
