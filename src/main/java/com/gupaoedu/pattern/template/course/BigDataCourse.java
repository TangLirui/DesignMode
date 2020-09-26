package com.gupaoedu.pattern.template.course;

public class BigDataCourse implements NetworkCourse {

    private boolean needHomeworkFlag = false;

    @Override
    public boolean needHomework() {
        return this.needHomeworkFlag;
    }

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    public void checkHomework() {
        System.out.println("检查大数据课后作业");
    }
}
