package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  Scanner entrada = new Scanner(System.in);

	  System.out.println("Numero: ");
	  int nun = entrada.nextInt();
    }

    public static  boolean primo(int nun){
        for (int i = 2; i< nun; i++) {
            if (nun % i == 0)
                return  false;
        }
        return true;
    }
}
