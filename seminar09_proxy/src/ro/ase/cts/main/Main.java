package ro.ase.cts.main;

import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.Spital;
import ro.ase.cts.proxy.ProxyCuAsigurare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("Andreea",false);
        Spital spital=new Spital("Militar");
        spital.interneazaPacient(pacient);

        ProxyCuAsigurare proxy=new ProxyCuAsigurare(spital);
        proxy.interneazaPacient(pacient);
    }
}