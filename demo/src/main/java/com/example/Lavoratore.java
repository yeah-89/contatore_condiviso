package com.example;

public class Lavoratore implements Runnable{

    private Contatore contatore;
    private String nome;

    public Lavoratore(Contatore cont, String n){
        contatore=cont;
        nome=n;
    }

    public void run(){
        while(contatore.incrementa(nome)!=false){
            try{
                Thread.sleep((int)Math.random()*(500-100)+100);
            }catch(InterruptedException e){
                System.out.println("Pausa interrotta");
            }
        }
    }

}
