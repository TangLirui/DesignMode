package com.gupaoedu.pattern.template.course;

public class BigDataCourse extends NetworkCourse {

    private boolean needHomeworkFlag = false;

    @Override
    protected boolean needHomework() {
        return this.needHomeworkFlag;
    }

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    void checkHomework() {
        System.out.println("检查大数据课后作业");
    }
}
