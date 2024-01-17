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
public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
         try (ClassPathXmlApplicationContext ctx = 
                new ClassPathXmlApplicationContext("applicationContext3.xml")) {
            var p = ctx.getBean("personBean", Person.class);
            
            p.callYourPet();
            
             System.out.println("surname:"+p.getSurname());
            //pet2.say();
        }
    }
    
}
