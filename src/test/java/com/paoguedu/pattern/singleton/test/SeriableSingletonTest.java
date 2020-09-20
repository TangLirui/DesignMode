package com.paoguedu.pattern.singleton.test;

import com.gupaoedu.pattern.singleton.lazy.LazyInnerClassSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriableSingletonTest {

    public static void main(String[] args) {

        LazyInnerClassSingleton l1 = null;
        LazyInnerClassSingleton l2 = LazyInnerClassSingleton.getInstance();

        FileOutputStream fos =null;

        try {
            fos = new FileOutputStream("l1.obj");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(l2);
            os.flush();
            os.close();

            FileInputStream fis = new FileInputStream("l1.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            l1 = (LazyInnerClassSingleton)ois.readObject();
            ois.close();

            System.out.println(l1.toString() + "\n" + l2.toString());


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
