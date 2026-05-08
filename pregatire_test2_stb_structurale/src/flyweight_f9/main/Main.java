package flyweight_f9.main;

import flyweight_f9.clase.Autobuz;
import flyweight_f9.clase.LinieAbstracta;
import flyweight_f9.clase.RegistruLinie;

public class Main {
    public static void main(String[] args) {
        RegistruLinie registru=new RegistruLinie();

        LinieAbstracta linie= registru.getLinie(100, "A", "B");
        LinieAbstracta linie2=registru.getLinie(200,"Y","Z");

        Autobuz autobuz=new Autobuz("Mercedes",2020,56);
        Autobuz autobuz2=new Autobuz("BMW",2025,64);
        Autobuz autobuz3=new Autobuz("Mercedes",2023,89);

        linie.afiseazaAutobuzPeLinie(autobuz);
        linie.afiseazaAutobuzPeLinie(autobuz2);
        linie2.afiseazaAutobuzPeLinie(autobuz3);

        registru.getLinie(200, "A", "B").afiseazaAutobuzPeLinie(autobuz);

    }
}
