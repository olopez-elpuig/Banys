package com.company;

public class Persona extends Thread{
    private String nom;
    private Genere genere;
    private Bany bany;

    public enum Genere {
        HOME, DONA
    }

    public Persona(String nom, Genere genere, Bany bany){
        this.nom = nom;
        this.genere = genere;
        this.bany = bany;
    }

    @Override
    public void run() {
        int segOcup = (int) (Math.random() * 8+1);
        bany.usar();
        System.out.println(nom + " ha entrat al bany durant " + segOcup + " minuts");

        try {
            Thread.sleep(segOcup * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nom + "acaba de sortir del bany");
        bany.banyLliure();
    }
}
