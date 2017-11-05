package com.my;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by neil on 2017/11/5.
 */
public class Provider {
    public static void main(String[] args) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        } catch (BeansException e) {
            e.printStackTrace();
        }
        synchronized (Provider.class) {
            while (true) {
                try {
                    Provider.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
