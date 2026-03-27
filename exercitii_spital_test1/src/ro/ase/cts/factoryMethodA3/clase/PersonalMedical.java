package ro.ase.cts.factoryMethodA3.clase;

import ro.ase.cts.factoryMethodA3.clase.PersonalSpital;

public abstract class PersonalMedical implements PersonalSpital {
    protected String nume;
    protected int varsta;
    protected int nrPacienti;

    public PersonalMedical(String nume, int varsta, int nrPacienti) {
        this.nume = nume;
        this.varsta = varsta;
        this.nrPacienti = nrPacienti;
    }
}
