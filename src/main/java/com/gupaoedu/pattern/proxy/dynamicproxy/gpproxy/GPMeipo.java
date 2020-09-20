package com.gupaoedu.pattern.proxy.dynamicproxy.gpproxy;

import com.gupaoedu.pattern.proxy.Person;

import java.lang.reflect.Method;

public class GPMeipo implements GPInvocationHandler{


    private Person target;

    public Object getInstance(Person target) throws Exception {
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();

        Object obj = method.invoke(this.target, args);

        after();
        return obj;

    }

    private void before() {
        System.out.println("我是媒婆，我要给你找对象，已确认需求");
        System.out.println("开始物色");

    }

    private void after() {
        System.out.println("ok的话，准备办事");
    }

}
