/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.el.spring_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author XIII
 */
@Component("personBean")
public class Person {
//    @Autowired
 //   @Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    /* public Person() {
    }*/
    
    
    public Person(Pet pet) {
        this.pet = pet;
        System.err.println("Person bean is created");
    }

    public void callYourPet(){
        System.err.println("Hellow, my pet!");
        this.pet.say();
    }
    
    
    /*   public void setPet(Pet pet) {
    System.err.println("Person: set pet");
    this.pet = pet;
    }*/
 
    public Pet getPet() {
        return pet;
    }
    

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }
    
    
    
    
    
    
}
