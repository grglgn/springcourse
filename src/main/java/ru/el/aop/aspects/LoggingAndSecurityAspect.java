/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.el.aop.aspects;

/**
 *
 * @author XIII
 */
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    
    @Pointcut("execution(* nevercall*())")
    private void allGetMethods(){
    }
    
    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice(JoinPoint point){
        System.out.println("beforeGetLoggingAdvice called from:"+point.toLongString());
    }
    
    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice(JoinPoint point){
        System.out.println("beforeGetSecurityAdvice called from:"+point.toLongString());
    }

}
