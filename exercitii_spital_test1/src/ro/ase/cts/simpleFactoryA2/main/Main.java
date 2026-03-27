package ro.ase.cts.simpleFactoryA2.main;

import ro.ase.cts.simpleFactoryA2.clase.PersonalSpital;
import ro.ase.cts.simpleFactoryA2.factory.Factory;
import ro.ase.cts.simpleFactoryA2.factory.TipPersonalSpital;

public class Main {
    public static void main(String[] args) {
        Factory fabricaPersonal=new Factory();
        PersonalSpital brancardier=fabricaPersonal.getPersonalSpitall(TipPersonalSpital.BRANCARDIER,"Brancardiiii",0);
        brancardier.afiseazaTipPersonalSpital();
        PersonalSpital asistent=fabricaPersonal.getPersonalSpitall(TipPersonalSpital.ASISTENT,"Asistentul123",21);
        asistent.afiseazaTipPersonalSpital();
        PersonalSpital medic=fabricaPersonal.getPersonalSpitall(TipPersonalSpital.MEDIC,"Ionescu",32);
        medic.afiseazaTipPersonalSpital();

    }
}
