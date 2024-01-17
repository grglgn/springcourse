/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.el.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.el.hibernate_test.entity.Employee;

/**
 *
 * @author XIII
 */
public class Test1 {

    public static void main(String[] args) {
        
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).buildSessionFactory();){
            Session s = factory.getCurrentSession();
            //Employee emp = new Employee("Ivan", "Smirnov", "Sales", 25000);
            Employee emp = new Employee("Alexey", "Surkoff", "HR", 15000);
            s.beginTransaction();
            s.save(emp);
            s.getTransaction().commit();
            System.out.println("Emp:"+emp);
            
        } 
    }

}
