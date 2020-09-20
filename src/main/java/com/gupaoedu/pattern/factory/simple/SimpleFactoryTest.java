package com.gupaoedu.pattern.factory.simple;

import com.gupaoedu.pattern.factory.ICourse;

public class SimpleFactoryTest {

    public static void main(String[] args) {

        CourseFactory courseFactory = new CourseFactory();

        ICourse javaCourse = courseFactory.create("JAVA");
        ICourse pythonCourse = courseFactory.create("PYTHON");

        javaCourse.record();
        pythonCourse.record();
    }
}
