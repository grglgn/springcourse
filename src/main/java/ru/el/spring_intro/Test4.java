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
public class Test4 {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext ctx = 
                new ClassPathXmlApplicationContext("applicationContext2.xml")) {
            var pet = ctx.getBean("myPet", Pet.class);
            //var pet2 = ctx.getBean("myPet", Pet.class);
            //System.err.println("age:"+pers.getAge());
            pet.say();
            //pet2.say();
            ctx.close();
        }
    }
}
