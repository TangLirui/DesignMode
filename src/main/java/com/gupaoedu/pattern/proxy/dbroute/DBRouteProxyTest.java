package com.gupaoedu.pattern.proxy.dbroute;

import com.gupaoedu.pattern.proxy.dbroute.db.proxy.OrderServiceDynamicProxy;
import com.gupaoedu.pattern.proxy.dbroute.db.proxy.OrderServiceStaticProxy;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DBRouteProxyTest {

    public static void main(String[] args) {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/02/01");

            Order order = new Order();

            order.setCreateTime(date.getTime());

            IOrderService orderService = (IOrderService)new OrderServiceDynamicProxy().getInstance(new OrderService());
            orderService.createOrder(order);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
