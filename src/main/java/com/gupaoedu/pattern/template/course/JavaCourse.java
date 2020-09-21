package com.gupaoedu.pattern.template.course;

public class JavaCourse extends NetworkCourse {
    @Override
    void checkHomework() {
        System.out.println("检查JAVA课程作业");
    }
}
