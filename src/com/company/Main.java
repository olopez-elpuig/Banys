package com.company;

public class Main {

    public static void main(String[] args) {
	Bany banyP1 = new Bany(2);
	Persona manuel = new Persona("Manuel", Persona.Genere.HOME, banyP1);
	Persona victor = new Persona("Victor", Persona.Genere.HOME, banyP1);
	Persona sara = new Persona("Sara", Persona.Genere.DONA, banyP1);
	Persona noelia = new Persona("Noelia", Persona.Genere.DONA, banyP1);

	manuel.start();
	victor.start();
	sara.start();
	noelia.start();

    }
}
