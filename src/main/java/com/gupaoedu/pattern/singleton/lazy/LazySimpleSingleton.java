package com.gupaoedu.pattern.singleton.lazy;

public class LazySimpleSingleton {

    private static LazySimpleSingleton lazy = null;

    private LazySimpleSingleton(){
        if(lazy != null) {
            throw new RuntimeException("不允许的构造方式");
        }
    }

    public synchronized static LazySimpleSingleton getInstance() {
        if(null == lazy) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

}
