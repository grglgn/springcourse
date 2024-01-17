/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.el.spring_intro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author XIII
 */
public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = 
                new AnnotationConfigApplicationContext(Conf.class);
        Person p = ctx.getBean("personBean", Person.class);
        //p.callYourPet();
        System.out.println("surname:"+p.getSurname());
        System.out.println("age:"+p.getAge());
    }
    
}
