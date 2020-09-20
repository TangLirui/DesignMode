package com.gupaoedu.pattern.factory.abstractfactory;

import java.util.Objects;



public class AbstractFactoryTest {

    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.createCourse().record();
        factory.createNote().note();
        factory.createVideo().video();

        ICourseFactory factory1 = new PythonCourseFactory();
        factory1.createCourse().record();
        factory1.createNote().note();
        factory1.createVideo().video();
    }



}
