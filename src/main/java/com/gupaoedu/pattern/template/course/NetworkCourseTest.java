package com.gupaoedu.pattern.template.course;

public class NetworkCourseTest {

    public static void main(String[] args) {
        System.out.println("----JAVA课程---");
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();


        System.out.println("---大数据课程---");
        NetworkCourse bigdataCourse = new BigDataCourse(true);
        bigdataCourse.createCourse();
    }
}
