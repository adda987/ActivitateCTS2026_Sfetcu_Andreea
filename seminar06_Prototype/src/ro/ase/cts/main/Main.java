package ro.ase.cts.main;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervarePrototype;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare=new Rezervare("Andreea",20,1,"1111222233334444");
        Rezervare r1= (Rezervare) rezervare.clonare();

        //setteri daca vrem sa modificam un antribut
        //cel putin 2 obiecte clonate
        r1.setOra(15);

        System.out.println(rezervare.toString());
        System.out.println(r1.toString());

    }
}
