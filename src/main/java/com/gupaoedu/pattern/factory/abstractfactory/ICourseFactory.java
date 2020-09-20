package com.gupaoedu.pattern.factory.abstractfactory;


import com.gupaoedu.pattern.factory.ICourse;
import com.gupaoedu.pattern.factory.INote;
import com.gupaoedu.pattern.factory.IVideo;

//一个品牌的抽象，组成一个产品族
public interface ICourseFactory {

    ICourse createCourse();

    INote createNote();

    IVideo createVideo();

}
