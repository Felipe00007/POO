package com.company;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new  Cliente(2,"Felipe");
        System.out.println(cliente.getnome());
        System.out.println(cliente.getDivida());
        cliente.aumentarDivida(580);
        System.out.println(cliente.getDivida());
        cliente.setNome("Fe");
        System.out.println(cliente.getnome());
    }
}
