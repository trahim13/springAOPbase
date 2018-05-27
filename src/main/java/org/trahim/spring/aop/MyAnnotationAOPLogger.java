package org.trahim.spring.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAnnotationAOPLogger {

    @Pointcut("execution(* * (..)) && within(org.trahim.spring.service.*)")
    private void myPointcut() {
    }

    @Before("myPointcut() &&@annotation(org.trahim.spring.aop.annotations.ShowDouble) && execution(double *(..))")
    public void printBefore() {
        System.out.println("Print before");
    }

    @After("myPointcut() && @annotation(org.trahim.spring.aop.annotations.ShowInt)")
    public void printAfter() {
        System.out.println("Print after");
    }


    @AfterReturning(pointcut = "myPointcut()", returning = "o")
    public void getVal(Object o) {
        System.out.println(o);
    }
}
