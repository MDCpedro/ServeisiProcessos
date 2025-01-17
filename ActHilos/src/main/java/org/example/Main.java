package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hilo principal: " + Thread.currentThread().getName());

        Hilo hilo1 = new Hilo("Hilo1");
        hilo1.start();
        Hilo hilo2 = new Hilo("Hilo2");
        hilo2.start();
        Hilo hilo3 = new Hilo("Hilo3");
        hilo3.start();
        Hilo hilo4 = new Hilo("Hilo4");
        hilo4.start();
        Hilo hilo5 = new Hilo("Hilo5");
        hilo5.start();

        System.out.println("Fin de los hilos");
    }
}