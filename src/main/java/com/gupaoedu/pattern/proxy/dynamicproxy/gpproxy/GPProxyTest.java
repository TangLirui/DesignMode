package com.gupaoedu.pattern.proxy.dynamicproxy.gpproxy;

import com.gupaoedu.pattern.proxy.Person;
import com.gupaoedu.pattern.proxy.dynamicproxy.jdkproxy.Girl;
import com.gupaoedu.pattern.proxy.dynamicproxy.jdkproxy.JDKMeipo;

public class GPProxyTest {

    public static void main(String[] args) {
        try {
            Person obj = (Person) new GPMeipo().getInstance(new Girl());
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
