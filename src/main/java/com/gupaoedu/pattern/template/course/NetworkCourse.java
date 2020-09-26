package com.gupaoedu.pattern.template.course;

public interface NetworkCourse {

     default void createCourse() {
        //1、发布预习资料
        this.postPreResource();

        //2、制作ppt
        this.createPPT();

        //3、在线直播
        this.liveVideo();

        //4、提交课件、笔记
        this.postNote();

        //5、提交源码
        this.postSource();

        //6、布置作业，有些课有，有些课没有
        //如果有作业，检查作业，如果没有，直接完成
        if(needHomework()) {
            checkHomework();
        }
    }

    void checkHomework();

    //钩子方法：实现流程微调，子类可以自定义
    default boolean needHomework(){
        return false;
    }

    default void postSource() {
        System.out.println("提交源代码");
    }

    default void postNote() {
        System.out.println("提交课件、笔记");
    }

    default void liveVideo() {
        System.out.println("直播授课");
    }

    default void createPPT() {
        System.out.println("创建备课ppt");
    }

    default void postPreResource() {
        System.out.println("发布预习资料");
    }
}
