/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.el.aop.aspects;

import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
/**
 *
 * @author XIII
 */
@Component
@Aspect 
public class LoggingAspect {
    
    /*@Before("execution(public void getBook())")
    public void beforeGetBookAdvice(){
    System.out.println("ru.el.aop.aspects.LoggingAspect.beforeGetBookAdvice()");
    }*/
}
