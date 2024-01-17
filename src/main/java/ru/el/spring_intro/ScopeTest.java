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
public class ScopeTest {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext ctx
                = new ClassPathXmlApplicationContext("applicationContext3.xml")) {
            
            var p = ctx.getBean("dog", Pet.class);
            p.say();

            //System.out.println("surname:" + p.getSurname());
            //pet2.say();
        }
    }

}
