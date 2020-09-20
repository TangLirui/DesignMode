package com.gupaoedu.pattern.factory.method;

import com.gupaoedu.pattern.factory.ICourse;
import com.gupaoedu.pattern.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
