package ro.ase.cts.factoryMethodA3.fabrici;


import ro.ase.cts.factoryMethodA3.clase.Asistent;
import ro.ase.cts.factoryMethodA3.clase.Medic;
import ro.ase.cts.factoryMethodA3.clase.PersonalSpital;


import static ro.ase.cts.factoryMethodA3.fabrici.TipPersonalMedical.ASISTENT;
import static ro.ase.cts.factoryMethodA3.fabrici.TipPersonalMedical.MEDIC;

public class PersonalMedicalFabrica implements PersonalSpitalFabrica{
    @Override
    public PersonalSpital getPersonalSpital(TipPersonalSpital tip, String nume, int varsta, int nrPacienti) {
        if (tip.equals(ASISTENT)) {
            return new Asistent(nume, varsta, nrPacienti);
        } else if (tip.equals(MEDIC)) {
            return new Medic(nume, varsta, nrPacienti);
        }
        return null;
    }

    @Override
    public PersonalSpital getPersonalSpital(TipPersonalSpital tip, String nume, int varsta) {
        return this.getPersonalSpital(tip,nume,varsta,9);
    }
}
