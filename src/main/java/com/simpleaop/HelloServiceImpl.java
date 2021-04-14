package com.simpleaop;

/**
 * @author chenlufeng
 * @date 2021/4/14
 */
public class HelloServiceImpl implements HelloService{
    @Override
    public void sayHelloWorld() {
        System.out.println("Hello world!");
    }
}
