package com.gupaoedu.pattern.observer.guava;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.gupaoedu.pattern.observer.gperadvice.Question;

import java.util.Observable;

/**
 * JDK提供的一种观察者的实现方式，被观察者
 * Created by Tom on 2019/3/17.
 */
public class GuavaGPer {

    public static final EventBus bus=new EventBus();

    private String name = "GPer生态圈";
    private static GuavaGPer gper = null;
    private GuavaGPer(){}

    public static GuavaGPer getInstance(){
        if(null == gper){
            gper = new GuavaGPer();
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    public void register(Object event) {
        if(null == event) {
             return;
        }
        bus.register(event);
    }

    public void publishQuestion(GuavaQuestion question){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        bus.post(question);
    }
}
