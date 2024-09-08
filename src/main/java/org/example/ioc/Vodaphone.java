package org.example.ioc;

public class Vodaphone implements Sim {
    @Override
    public void calling() {
        System.out.println("Calling with Vodaphone");
    }

    @Override
    public void data() {
        System.out.println("Browsing with Vodaphone");
    }
}
