package com.gupaoedu.pattern.proxy.dynamicproxy.jdkproxy;

import com.gupaoedu.pattern.proxy.Person;

import java.io.FileOutputStream;

public class JDKProxyTest {

    public static void main(String[] args) {
        try {
            Person obj = (Person) new JDKMeipo().getInstance(new Girl());
            obj.findLove();

            //调用原理
//            byte[] bytes = ProxyGenerator.generateProxyClass("$proxy0", new Class[]{Person.class});
//            FileOutputStream os = new FileOutputStream("D://$Proxy0.class");
//            os.write(bytes);
//            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
