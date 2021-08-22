package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Impressora impressora1 = new Impressora("Epson", "wifi", LocalDate.of(2020,08,20));
        System.out.println(impressora1.getDataFabricacao());

    }
}
