package com.gupaoedu.pattern.factory.simple;


import com.gupaoedu.pattern.factory.ICourse;
import com.gupaoedu.pattern.factory.JavaCourse;
import com.gupaoedu.pattern.factory.PythonCourse;

public class CourseFactory {

    public ICourse create(String courseName) {
        if("JAVA".equals(courseName)) {
            return new JavaCourse();
        } else if("PYTHON".equals(courseName)){
            return new PythonCourse();
        }else {
            return null;
        }
    }
}
