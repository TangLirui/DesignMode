package com.gupaoedu.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;
import com.gupaoedu.pattern.observer.gperadvice.GPer;
import com.gupaoedu.pattern.observer.gperadvice.Question;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * Created by Tom on 2019/3/17.
 */
public class GuavaTeacher {
    private String name;
    public GuavaTeacher(String name){
        this.name = name;
    }

    @Subscribe
    public void update(Object arg) {
        GuavaQuestion question = (GuavaQuestion)arg;
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
        "您收到了一个来自“" + question.getCommunityName() + "”的提问，希望您解答，问题内容如下：\n" +
        question.getContent() + "\n" +
        "提问者：" + question.getUserName());
    }
}
