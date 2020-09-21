package com.gupaoedu.pattern.template.course;

public abstract class NetworkCourse {

    protected final void createCourse() {
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

    abstract void checkHomework();

    //钩子方法：实现流程微调，子类可以自定义
    protected boolean needHomework(){
        return false;
    }

    final void postSource() {
        System.out.println("提交源代码");
    }

    private void postNote() {
        System.out.println("提交课件、笔记");
    }

    final void liveVideo() {
        System.out.println("直播授课");
    }

    final void createPPT() {
        System.out.println("创建备课ppt");
    }

    final void postPreResource() {
        System.out.println("发布预习资料");
    }
}
