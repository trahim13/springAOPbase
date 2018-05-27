package org.trahim.spring.service;

import org.springframework.stereotype.Component;
import org.trahim.spring.aop.annotations.ShowDouble;
import org.trahim.spring.aop.annotations.ShowInt;

@Component
public class MyService {
    @ShowInt
    public int getIntValue(int value) {
        return value*2;
    }

    @ShowDouble
    public double getDoubleValue() {
        return 6.6;
    }
}
