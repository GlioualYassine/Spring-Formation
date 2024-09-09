package org.example.test;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

 @Component
public class Parrot {
    private String name;

    public Parrot() {
        System.out.println("Le Parrot a été créé.");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     @PostConstruct
     public void init() {
         //this.name = "Koko";
         System.out.println("Le Parrot a été initialisé avec le nom : " + name);
     }

     @PreDestroy
     public void cleanup() {
         System.out.println("Le Parrot va être détruit.");
     }

     @Override
     public String toString() {
         return "Parrot{" +
                 "name='" + name + '\'' +
                 '}';
     }
 }