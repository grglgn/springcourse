/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.el.spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author XIII
 */
public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        var pers = ctx.getBean("myPerson", Person.class);
        pers.callYourPet();
        System.err.println("surname:"+pers.getSurname());
        System.err.println("age:"+pers.getAge());
        ctx.close();
    }
}
