package org.example.ioc;

public class Unwi implements Sim {
    @Override
    public void calling() {
        System.out.println("Calling with Unwi");
    }

    @Override
    public void data() {
        System.out.println("Browsing with Unwi");
    }
}
