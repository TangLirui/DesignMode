package com.gupaoedu.pattern.proxy.dbroute;

public class OrderDao {

    public int insert(Order order) {
        System.out.println("OrderDao 创建order成功");
        return 1;
    }
}
