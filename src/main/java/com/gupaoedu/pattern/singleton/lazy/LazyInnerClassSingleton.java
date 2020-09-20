package com.gupaoedu.pattern.singleton.lazy;

import org.springframework.cglib.proxy.LazyLoader;

import java.io.Serializable;

public class LazyInnerClassSingleton implements Serializable {

    private LazyInnerClassSingleton(){
        if(LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许的构造方式");
        }
    }

    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

    private Object readResolve() {
        return LazyHolder.LAZY;
    }
}
