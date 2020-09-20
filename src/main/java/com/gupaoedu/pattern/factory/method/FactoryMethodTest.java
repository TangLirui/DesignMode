package com.gupaoedu.pattern.factory.method;

import com.gupaoedu.pattern.factory.ICourse;

public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();

        ICourse course = factory.create();
    }
}
