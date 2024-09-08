package org.example;

import org.example.test.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Parrot p = context.getBean("parrot",Parrot.class);
        System.out.println(p.getName());
        ((ConfigurableApplicationContext) context).close();

        //        var context  = new AnnotationConfigApplicationContext(ProjectConfig.class);
//
//        Parrot p = context.getBean(Parrot.class);
//        System.out.println(p);
//
//        System.out.println(p.getName());
//
//        // Ferme correctement le contexte pour invoquer @PreDestroy
//        context.close();

        /*
        test.Parrot p = context.getBean("parrot1", test.Parrot.class);
        System.out.println(p.getName());


        String s = context.getBean(String.class);
        System.out.println(s);


        Integer n = context.getBean(Integer.class);
        System.out.println(n);


        test.Parrot p2 = context.getBean("parrot2", test.Parrot.class);
        System.out.println("test.Parrot 2: " + p2.getName());






        Parrot x = new Parrot();
        x.setName("Kiki");

        Supplier<Parrot> parrotSupplier = () -> x;
        context.registerBean("kiki", Parrot.class, parrotSupplier);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());  */
    }
}