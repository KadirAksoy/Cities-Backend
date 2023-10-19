package com.kadiraksoy.CitiesBackend.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {


    @Before("execution(public void readAndSaveCsvFile())")
    public void beforeReadAndSaveCsvFileAdvice(){
        System.out.println("=======> @Before advice on readAndSaveCsvFile");
    }
}
