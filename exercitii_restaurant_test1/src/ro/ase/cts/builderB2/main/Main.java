package ro.ase.cts.builderB2.main;

import ro.ase.cts.builderB2.clase.AbstractBuilder;
import ro.ase.cts.builderB2.clase.Rezervare;
import ro.ase.cts.builderB2.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder=new RezervareBuilder();
        builder.setMuzicaAmbientala(true);

        Rezervare r1=builder.build("Sfetcu Andreea");
        Rezervare r2=builder.build("Sfetcu Alina");
        System.out.println(r1.toString());
        System.out.println(r2.toString());

        r2.setDecorareMasa(true);
        System.out.println(r2.toString());
    }
}
