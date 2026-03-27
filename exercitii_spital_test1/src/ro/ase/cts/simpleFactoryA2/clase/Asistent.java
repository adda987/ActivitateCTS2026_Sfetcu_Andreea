package ro.ase.cts.simpleFactoryA2.clase;

public class Asistent implements PersonalSpital{
    private String nume;
    private int nrPacienti;

    public Asistent(String nume, int nrPacienti) {
        this.nume = nume;
        this.nrPacienti = nrPacienti;
    }

    @Override
    public void afiseazaTipPersonalSpital() {
        System.out.println("Asistentul cu numele "+nume+" are "+nrPacienti+" pacienti");
    }
}
