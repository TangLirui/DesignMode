package com.paoguedu.pattern.singleton.test;

import com.gupaoedu.pattern.singleton.lazy.LazyInnerClassSingleton;
import com.gupaoedu.pattern.singleton.lazy.LazySimpleSingleton;

import java.io.Serializable;
import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {

    private static LazyInnerClassSingletonTest tester = new LazyInnerClassSingletonTest(); //step 1
    private static int count1;               //step 2
    private static int count2 = 2;           //step 3
    public LazyInnerClassSingletonTest(){                           //step 4
        count1++;
        count2++;
        System.out.println("" + count1 + count2);
    }
    public static LazyInnerClassSingletonTest getTester(){          //step 5
        return tester;
    }


}
