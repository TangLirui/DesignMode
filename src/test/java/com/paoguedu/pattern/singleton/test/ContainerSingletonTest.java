package com.paoguedu.pattern.singleton.test;

import com.gupaoedu.pattern.singleton.register.ContainerSingleton;

public class ContainerSingletonTest {

    public static void main(String[] args) {

        System.out.println("begin");
        LazyInnerClassSingletonTest.getTester();
        Object obj = ContainerSingleton.getBean("com.paoguedu.pattern.singleton.test.ExectorThread");
        System.out.println(obj);
    }


}
