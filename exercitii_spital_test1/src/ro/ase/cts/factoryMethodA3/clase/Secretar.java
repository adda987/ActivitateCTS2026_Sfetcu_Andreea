package ro.ase.cts.factoryMethodA3.clase;

public class Secretar extends PersonalNonMedical{
    public Secretar(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void afiseaza() {
        System.out.println("Secretarul cu numele "+nume
                +" are "+varsta+ "ani");
    }
}
