package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	  Cachorro cachorro1 = new Cachorro("DOG", LocalDate.of(2021,8,25),15,false,false);
	  System.out.println(cachorro1.getNome() + " Com Peso "+ cachorro1.getPeso() + cachorro1.encaminharAdocao());
    }
}
