package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.ModalitateDePlata;
import ro.ase.cts.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Andreea");
        client.platesteTranzactie(250);

        ModalitateDePlata modalitate1= new PlataCash(500);
        client.setModalitateDePlata(modalitate1);
        client.platesteTranzactie(100);
        client.platesteTranzactie(50);

    }
}
