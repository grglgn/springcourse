/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.el.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author XIII
 */
public class Test1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(MyConfig.class);
        Library lib = ctx.getBean("library", Library.class);
        System.out.println("before getBook()");
        Book b = lib.getBook("mr.Johonson", "J.H.Chase");
        System.out.println("after getBook():"+b);
        ctx.close();
    }

}
