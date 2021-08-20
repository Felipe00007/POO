package com.company;

import java.time.LocalDate;

public class Cachorro {

    private String nome;
    private LocalDate anoNasc;
    private int peso;
    private Boolean chip;
    private Boolean ferido;

    public Cachorro(String nome, LocalDate anoNasc, int peso, Boolean chip, Boolean ferido) {
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.peso = peso;
        this.chip = chip;
        this.ferido = ferido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public LocalDate getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(LocalDate anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Boolean getChip() {
        return chip;
    }

    public void setChip(Boolean chip) {
        this.chip = chip;
    }

    public Boolean getFerido() {
        return ferido;
    }

    public void setFerido(Boolean ferido) {
        this.ferido = ferido;
    }

    public String encaminharAdocao(){
        if(peso >= 5 && ferido == false){
            return " Pode ser Encaminhado";
        }else {
            return "Não pode ser Encaminhdo";
        }
    }
}
