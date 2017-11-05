package com.my;

import com.my.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by neil on 2017/11/5.
 */
public class Consumer {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        OrderService orderService = context.getBean("localOrderService",OrderService.class);

        int i = 0;
        while (true) {
            System.out.println(orderService.getName("test" + i));
            System.out.println(orderService.getSize("" + i));
            i++;
            if (i >= 20) {
                break;
            }
            Thread.sleep(2000);
        }


    }
}
