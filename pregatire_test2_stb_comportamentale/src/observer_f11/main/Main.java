package observer_f11.main;

import observer_f11.clase.Autobuz;
import observer_f11.clase.Calator;
import observer_f11.clase.CalatorAbonat;
import observer_f11.clase.IAutobuz;

public class Main {
    public static void main(String[] args) {
        Calator calator1=new CalatorAbonat("Andreea");
        Calator calator2=new CalatorAbonat("Denis");
        Calator calator3=new CalatorAbonat("Alina");
        Calator calator4=new CalatorAbonat("Beniamin");

        IAutobuz autobuz=new Autobuz("DB87DEI");
        autobuz.aboneazaCalator(calator1);
        autobuz.aboneazaCalator(calator2);
        autobuz.aboneazaCalator(calator3);
        autobuz.aboneazaCalator(calator4);
        ((Autobuz)autobuz).pleacaDeLaCapatDeLinie();
        autobuz.dezaboneazaCalator(calator4);
        System.out.println("=================");
        ((Autobuz)autobuz).pleacaDeLaCapatDeLinie();


    }
}
