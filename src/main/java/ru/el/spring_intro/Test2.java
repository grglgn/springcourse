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
public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet p = ctx.getBean("myPet", Pet.class);
        p.say();
        ctx.close();
    }
}
