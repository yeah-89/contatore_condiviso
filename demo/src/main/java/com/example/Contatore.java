package com.example;

public class Contatore {

    private int valore=0;
    private int valoreMassimo;

    public Contatore(int num){
        valoreMassimo=num;
    }

    public boolean incrementa(String nomeThread){
        if(valore<valoreMassimo){
            valore++;
            System.out.println(nomeThread + " ha incrementato il valore a: " + valore);
            return true;
        }
        return false;
    }

}
