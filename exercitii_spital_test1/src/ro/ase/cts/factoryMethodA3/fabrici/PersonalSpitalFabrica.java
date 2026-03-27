package ro.ase.cts.factoryMethodA3.fabrici;


import ro.ase.cts.factoryMethodA3.clase.PersonalSpital;

public interface PersonalSpitalFabrica {
    public PersonalSpital getPersonalSpital(TipPersonalSpital tip, String nume, int varsta, int nrPacienti);

    public PersonalSpital getPersonalSpital(TipPersonalSpital tip,String nume,int varsta);

}
