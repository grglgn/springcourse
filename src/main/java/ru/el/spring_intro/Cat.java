/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.el.spring_intro;

import org.springframework.stereotype.Component;

/**
 *
 * @author XIII
 */
@Component("catBean")
public class Cat implements Pet {
    
    private long timestamp;

    public Cat() {
        System.out.println("Cat bean is created");
        this.timestamp=System.currentTimeMillis();
    }
    
    public void init(){
        System.out.println("Cat init");
    }
    
    public void destroy(){
        System.out.println("Cat destroy");
    }

    @Override
    public void say() {
        System.err.println("Meow-Meow "+this.timestamp);
    }
    
}
