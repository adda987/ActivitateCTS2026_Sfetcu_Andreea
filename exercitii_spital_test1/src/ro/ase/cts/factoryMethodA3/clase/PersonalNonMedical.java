package ro.ase.cts.factoryMethodA3.clase;

import ro.ase.cts.factoryMethodA3.clase.PersonalSpital;

public abstract class PersonalNonMedical implements PersonalSpital {
    protected String nume;
    protected int varsta;

    public PersonalNonMedical(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
}
