package ro.ase.cts.factoryMethodA3.fabrici;

import ro.ase.cts.factoryMethodA3.clase.Registrator;
import ro.ase.cts.factoryMethodA3.clase.Secretar;
import ro.ase.cts.factoryMethodA3.clase.PersonalSpital;

import static ro.ase.cts.factoryMethodA3.fabrici.TipPersonalNonMedical.REGISTRATOR;
import static ro.ase.cts.factoryMethodA3.fabrici.TipPersonalNonMedical.SECRETAR;

public class PersonalNonMedicalFabrica implements PersonalSpitalFabrica{
    @Override
    public PersonalSpital getPersonalSpital(TipPersonalSpital tip, String nume, int varsta, int nrPacienti) {
        if (tip.equals(SECRETAR)) {
            return new Secretar(nume, varsta);
        } else if (tip.equals(REGISTRATOR)) {
            return new Registrator(nume, varsta);
        }
        return null;
    }

    @Override
    public PersonalSpital getPersonalSpital(TipPersonalSpital tip, String nume, int varsta) {
        return this.getPersonalSpital(tip,nume,varsta,0);
    }
}
