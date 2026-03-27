package ro.ase.cts.factoryMethodA3.clase;

public class Asistent extends PersonalMedical{

    public Asistent(String nume, int varsta, int nrPacienti) {
        super(nume, varsta, nrPacienti);
    }

    @Override
    public void afiseaza() {
        System.out.println("Asistentul cu numele "+nume
                +" are "+varsta+ "ani, si "+nrPacienti+ " pacienti");
    }
}
