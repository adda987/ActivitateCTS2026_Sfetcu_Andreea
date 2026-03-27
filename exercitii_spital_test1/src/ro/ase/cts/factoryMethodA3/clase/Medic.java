package ro.ase.cts.factoryMethodA3.clase;

public class Medic extends PersonalMedical{
    public Medic(String nume, int varsta, int nrPacienti) {
        super(nume, varsta, nrPacienti);
    }

    @Override
    public void afiseaza() {
        System.out.println("Medicul cu numele "+nume
                +" are "+varsta+ "ani, si "+nrPacienti+ " pacienti");
    }


}
