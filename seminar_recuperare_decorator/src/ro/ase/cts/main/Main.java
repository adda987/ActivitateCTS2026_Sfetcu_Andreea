package ro.ase.cts.main;


import ro.ase.cts.clase.NotaDePlata;
import ro.ase.cts.clase.NotaDePlataAbstract;
import ro.ase.cts.decorator.NotaDePlata1Mai;
import ro.ase.cts.decorator.NotaDePlataDecorator;
import ro.ase.cts.decorator.NotaDePlataNoulAn;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaDePlata = new NotaDePlata(25.50, "1/05/2026");
        notaDePlata.printeaza();

        System.out.println("\n----------------------\n");

        NotaDePlataDecorator notaDePlata2 = null;
        int input = 2;

        if (input == 1) {
            notaDePlata2 = new NotaDePlataNoulAn(notaDePlata);
        } else if (input == 2) {
            notaDePlata2 = new NotaDePlata1Mai(notaDePlata);
        }
        notaDePlata2.printeaza();
        notaDePlata2.printeazaFelicitare();
    }
}
