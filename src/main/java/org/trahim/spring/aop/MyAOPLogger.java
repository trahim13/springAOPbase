package org.trahim.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class MyAOPLogger {
    public void printValue(Object o) {
        System.out.println(o);
    }

    public void init() {
        System.out.println("Init.");
    }

    public void close() {
        System.out.println("Close.");
    }
}
