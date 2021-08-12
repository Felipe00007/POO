package com.company;

import java.util.Scanner;

public class Main {

    public static String dataNasc(String dia, String mes, String ano){
         String data = "Sua data é " + dia + "/" + mes + "/" + ano;
         return  data;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite seu nome");
        String nome = entrada.nextLine();
        System.out.println("Digite seu sobrenome");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite seu data de anivesário: ");
        String dia = entrada.nextLine();
        String mes = entrada.nextLine();
        String ano = entrada.nextLine();

        char inicialn = nome.charAt(0);
        char inicials = sobrenome.charAt(0);

        System.out.println("Seu nome é: " + nome + " " + sobrenome);
        System.out.println("Suas iniciais são: " + inicialn + " " + inicials );
        System.out.println(dataNasc(dia, mes, ano));
    }
}
