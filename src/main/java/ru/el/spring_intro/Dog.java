/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.el.spring_intro;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;
/**
 *
 * @author XIII
 */
@Component
@Scope("singleton")
public class Dog implements Pet{

    public Dog() {
        System.err.println("Dog bean is created");
    }
    
    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
    
    @PostConstruct
    public void init(){
        System.out.println("Dog init");
    }
    
    @PreDestroy
    public void destroy(){
        System.out.println("Dog destroy");
    }
}
