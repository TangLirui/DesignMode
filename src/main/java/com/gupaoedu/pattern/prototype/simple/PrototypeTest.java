package com.gupaoedu.pattern.prototype.simple;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {

    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();

        concretePrototypeA.setAge(18);
        concretePrototypeA.setName("Tome");
        List hobbies = new ArrayList<String>();
        concretePrototypeA.setHobbies(hobbies);

        Client client = new Client();
        ConcretePrototypeA copy = (ConcretePrototypeA)client.startClone(concretePrototypeA);
        System.out.println(copy);

        System.out.println("克隆对象引用类型地址的值：" + copy);
        System.out.println("原对象引用类型地址的值：" + concretePrototypeA);
        System.out.println("对象地址比较：" + (concretePrototypeA.getHobbies() == copy.getHobbies()));
    }
}
