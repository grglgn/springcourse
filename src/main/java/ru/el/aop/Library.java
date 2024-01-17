/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.el.aop;
import org.springframework.stereotype.Component;

/**
 *
 * @author XIII
 */
@Component
public class Library {
    
    public Book getBook(String name, String author){
        System.out.println("before getBook()");
        Book b = new Book(name,author);
        return b;
    }
    
    public void returnBook(){
        System.out.println("ru.el.aop.Library.returnBook()");
    }
    
}
