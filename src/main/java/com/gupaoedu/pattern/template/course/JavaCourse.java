package com.gupaoedu.pattern.template.course;

public class JavaCourse implements NetworkCourse {
    @Override
    public void checkHomework() {
        System.out.println("检查JAVA课程作业");
    }
}
