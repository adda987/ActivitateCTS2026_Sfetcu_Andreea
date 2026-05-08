package composite_f6.main;

import composite_f6.clase.Autobuz;
import composite_f6.clase.ElementFlota;
import composite_f6.clase.GrupareAutobuze;

public class Main {
    public static void main(String[] args) {
        ElementFlota flota=new GrupareAutobuze("Flota STB");
        ElementFlota grupare1=new GrupareAutobuze("Grupuri mici - 10 locuri");
        ElementFlota grupare2=new GrupareAutobuze("Grupuri medii - 30 locuri");
        ElementFlota grupare3=new GrupareAutobuze("Grupuri mari - 50 locuri");

        ElementFlota autobuz1=new Autobuz("Mercedes","Citaro",9);
        ElementFlota autobuz2=new Autobuz("MAN","Lion's City",15);
        ElementFlota autobuz3=new Autobuz("Solaris","Urbino",55);

        ((GrupareAutobuze) grupare1).adaugaElement(autobuz1);
        ((GrupareAutobuze) grupare2).adaugaElement(autobuz2);
        ((GrupareAutobuze) grupare3).adaugaElement(autobuz3);

        ((GrupareAutobuze) flota).adaugaElement(grupare1);
        ((GrupareAutobuze) flota).adaugaElement(grupare2);
        ((GrupareAutobuze) flota).adaugaElement(grupare3);

        flota.afiseazaDetalii("");
    }
}
