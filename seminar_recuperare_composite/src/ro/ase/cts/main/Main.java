package ro.ase.cts.main;

import ro.ase.cts.clase.Departament;
import ro.ase.cts.clase.Sectie;
import ro.ase.cts.clase.Structura;

public class Main {
    public static void main(String[] args) {

        Structura departamentSpital=new Departament("Spital");
        Structura departamentAdministrativ=new Departament("Administrativ");

        Structura sectieSecretariat=new Sectie("Secretariat",12);
        Structura sectieManagement=new Sectie("Management",8);

        ((Departament)departamentSpital).adaugaStructura(departamentAdministrativ);
        ((Departament)departamentSpital).adaugaStructura(sectieManagement);

        ((Departament)departamentAdministrativ).adaugaStructura(sectieSecretariat);

        departamentSpital.afiseazaDetalii("");


        ((Departament)departamentSpital).stergeStructura(sectieManagement);
        ((Departament)departamentAdministrativ).adaugaStructura(sectieManagement);

        System.out.println("\n-----------\n");
        departamentSpital.afiseazaDetalii("");
    }
}
