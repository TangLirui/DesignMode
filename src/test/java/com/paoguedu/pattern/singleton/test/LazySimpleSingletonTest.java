package com.paoguedu.pattern.singleton.test;



public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        //LazySimpleSingleton.getInstance();

        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());

        t1.start();
        t2.start();

        System.out.println("Exctor End");
    }
}
