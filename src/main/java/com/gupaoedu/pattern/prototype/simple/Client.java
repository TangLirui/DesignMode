package com.gupaoedu.pattern.prototype.simple;

public class Client {

//    private Prototype prototype;
//
//    public Client(Prototype prototype) {
//        this.prototype = prototype;
//    }

    public Prototype startClone(Prototype prototype) {
        return prototype.clone();
    }
}
