package com.example;

public class Main {
    public static void main(String[] args) {
        Contatore c1= new Contatore(10);

        Lavoratore l1= new Lavoratore(c1, "soffiano");
        Lavoratore l2= new Lavoratore(c1, "cri");

        Thread t1 =new Thread(l1);
        Thread t2 =new Thread(l2);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }


    }
}