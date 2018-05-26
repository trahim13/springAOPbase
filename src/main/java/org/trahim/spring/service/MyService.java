package org.trahim.spring.service;

import org.springframework.stereotype.Component;
import org.trahim.spring.aop.annotations.ShowDouble;
import org.trahim.spring.aop.annotations.ShowInt;

@Component
public class MyService {
    @ShowInt
    public int getIntValue() {
        return 5;
    }

    @ShowDouble
    public double getDoubleValue() {
        return 6.6;
    }
}
