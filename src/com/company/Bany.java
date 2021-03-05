package com.company;

public class Bany {
    private int limite;
    private int personaOcupando;
    private Estado estado;

    enum Estado{
        OCUPAT, LLIURE;
    }

    public Bany(int limite) {
        this.limite = limite;
        estado = Estado.LLIURE;
        personaOcupando = 0;
    }

    synchronized public void usar(){
        try {
            while (!estado.equals(Estado.LLIURE) || personaOcupando >= limite) {
                wait();
            }
            estado = Estado.OCUPAT;
            personaOcupando++;
            notifyAll();
        }catch (InterruptedException e){

        }
    }

    synchronized public void banyLliure(){
        estado = Estado.LLIURE;
        personaOcupando--;
        notify();
    }
}
