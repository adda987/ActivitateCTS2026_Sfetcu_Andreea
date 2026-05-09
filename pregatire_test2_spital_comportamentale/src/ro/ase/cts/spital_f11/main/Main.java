package ro.ase.cts.spital_f11.main;

import ro.ase.cts.spital_f11.clase.ModalitateDePlata;
import ro.ase.cts.spital_f11.clase.Pacient;
import ro.ase.cts.spital_f11.clase.PlataCard;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("Andreea");
        Pacient pacient1=new Pacient("Daniela");

        pacient.platesteInternarea(370);
        pacient1.platesteInternarea(500);

        pacient1.setModalitateDePlata(new PlataCard());
        pacient1.platesteInternarea(290);


    }
}
