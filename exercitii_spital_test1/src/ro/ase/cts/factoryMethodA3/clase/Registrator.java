package ro.ase.cts.factoryMethodA3.clase;

public class Registrator extends PersonalNonMedical{
    public Registrator(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void afiseaza() {
        System.out.println("Registratorul cu numele "+nume
                +" are "+varsta+ "ani");
    }
}
