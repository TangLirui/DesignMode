package com.gupaoedu.pattern.observer.guava;

import com.google.common.eventbus.EventBus;
import com.gupaoedu.pattern.observer.gperadvice.Question;


/**
 * Created by Tom on 2019/3/17.
 */
public class GuavaEventTest {

    public static void main(String[] args) {

        GuavaGPer guavaGPer = GuavaGPer.getInstance();
        //注册监听者
        guavaGPer.register(new GuavaTeacher("Tom"));

        GuavaQuestion question = new GuavaQuestion();
        question.setCommunityName(guavaGPer.getName());
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");

        guavaGPer.publishQuestion(question);


        //从Struts到SpringMVC的升级
        //因为Struts面向的类，而SpringMVC面向的是方法

        //前面两者面向的是类，Guava面向是方法

        //能够轻松落地观察模式的一种解决方案
        //MQ
    }
}
