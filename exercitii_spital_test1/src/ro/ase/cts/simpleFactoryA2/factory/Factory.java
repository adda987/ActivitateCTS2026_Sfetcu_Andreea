package ro.ase.cts.simpleFactoryA2.factory;

import ro.ase.cts.simpleFactoryA2.clase.Asistent;
import ro.ase.cts.simpleFactoryA2.clase.Brancardier;
import ro.ase.cts.simpleFactoryA2.clase.Medic;
import ro.ase.cts.simpleFactoryA2.clase.PersonalSpital;

public class Factory {
    public PersonalSpital getPersonalSpitall(TipPersonalSpital tip,String nume,int nrPacienti){
        switch(tip){
            case MEDIC:
                return new Medic(nume, nrPacienti);
            case BRANCARDIER:
                return new Brancardier(nume, nrPacienti);
            case ASISTENT:
                return new Asistent(nume, nrPacienti);
            default:
                return null;
        }
    }
}
