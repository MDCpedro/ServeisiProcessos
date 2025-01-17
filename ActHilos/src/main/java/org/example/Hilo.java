package org.example;

public class Hilo extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Soy el hilo: " + Thread.currentThread().getName());
    }

    public Hilo(String name) {
        super(name);
    }
}
