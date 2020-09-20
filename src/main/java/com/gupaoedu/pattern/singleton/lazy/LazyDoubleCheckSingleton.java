package com.gupao.pattern.singleton.lazy;

public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton(){}

    //双重检查锁
    public static LazyDoubleCheckSingleton getInstance() {
        if(null == lazy) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if(null == lazy) {
                    lazy = new LazyDoubleCheckSingleton();
                    //CPU执行转换JVM指令 valatile
                    //指令重排序（2、3）
                    //1、分配内存给对象
                    //2、给内存赋值初始化
                    //3、将初始化好的对象和内存地址建立关联，赋值
                    //4、用户初次访问
                }
            }
        }
        return lazy;
    }
}
