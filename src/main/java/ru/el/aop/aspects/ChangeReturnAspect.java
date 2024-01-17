/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.el.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;

import ru.el.aop.Book;

/**
 *
 * @author XIII
 */
@Component
@Aspect
public class ChangeReturnAspect {

    //@Around(pointcut="execution(Book get*(..))", returning="book")
    @Around("execution(* get*(..))")
    public Book aroundReturningAdvice(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around 1");
        Object o = point.proceed();
        Book book = (Book)o;
        book.setAuthor("Mr. "+book.getAuthor());
        return book;
    }
}
