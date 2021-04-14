package com.simpleaop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author chenlufeng
 * @date 2021/4/14
 */
public class CGlibDynamicProxy implements MethodInterceptor {

    private static CGlibDynamicProxy instance = new CGlibDynamicProxy();

    public CGlibDynamicProxy getInstance(){
        return instance;
    }

    public <T> T getProxy(Class<T> cls){
        return (T) Enhancer.create(cls,this);
    }


    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(target, args);
        after();
        return result;
    }

    private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }
}
