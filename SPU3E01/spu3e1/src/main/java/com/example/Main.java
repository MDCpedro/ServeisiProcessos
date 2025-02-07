package com.example;

import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        int puerto = 5000;
        int numConexiones = 0;
        try (ServerSocket server = new ServerSocket(puerto)) {
            System.out.println("Server iniciado");
            
            while (true) {
                Socket cliente = server.accept();
                numConexiones++;
                System.out.println("Se han conectado: " +numConexiones+ " clientes");
                cliente.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}