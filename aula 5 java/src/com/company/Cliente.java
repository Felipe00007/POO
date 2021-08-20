package com.company;

public class Cliente {
    private int numeroCliente;
    private  String nome;
    private double divida;

    public Cliente(int numero, String nome){
        this.numeroCliente = numero;
        this.nome = nome;
        this.divida = 0;
    }

    public int getNumeroCliente(){
        return this.numeroCliente;
    }
    public  void  setNumeroCliente(int numeroCliente){
        this.numeroCliente = numeroCliente;
    }

    public String getnome(){
        return this.nome;
    }
    public  void  setNome(String nome){
        this.nome = nome;
    }

    public  double getDivida(){
        return this.divida;
    }

    public void setDivida(){
        this.divida = divida;
    }

    public  String aumentarDivida(double valor){
        this.divida = divida + valor;
        return  "Sua divida aumentou" +this.divida;
    }

    public String pagarDividada(){
        this.divida = 0;
        return  "Você pagou sua divida";

    }
}
