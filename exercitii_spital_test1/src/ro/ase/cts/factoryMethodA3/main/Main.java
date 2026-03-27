package ro.ase.cts.factoryMethodA3.main;


import ro.ase.cts.factoryMethodA3.clase.PersonalSpital;
import ro.ase.cts.factoryMethodA3.fabrici.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpitalFabrica fabrica=new PersonalMedicalFabrica();
        PersonalSpital asistent=fabrica.getPersonalSpital(TipPersonalMedical.ASISTENT,"nume1",45,2);
        asistent.afiseaza();
        PersonalSpital medic=fabrica.getPersonalSpital(TipPersonalMedical.MEDIC,"nume2",56,33);
        medic.afiseaza();

        PersonalSpitalFabrica fabrica2=new PersonalNonMedicalFabrica();
        PersonalSpital secretar=fabrica2.getPersonalSpital(TipPersonalNonMedical.SECRETAR,"nume4",23);
        secretar.afiseaza();
        PersonalSpital registrator=fabrica2.getPersonalSpital(TipPersonalNonMedical.REGISTRATOR,"nume5",33);
        registrator.afiseaza();
    }
}
