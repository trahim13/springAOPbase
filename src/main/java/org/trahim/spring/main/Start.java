package org.trahim.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.trahim.spring.service.MyService;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        MyService myService = (MyService) context.getBean("myService");
        int intValue = myService.getIntValue();


    }
}
