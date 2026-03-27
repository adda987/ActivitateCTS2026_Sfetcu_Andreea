package ro.ase.cts.simpleFactoryA2.clase;

public class Medic implements PersonalSpital{

    private String nume;
    private int nrPacienti;

    public Medic(String nume, int nrPacienti) {
        this.nume = nume;
        this.nrPacienti = nrPacienti;
    }

    @Override
    public void afiseazaTipPersonalSpital() {
        System.out.println("Medicul cu numele "+nume+" are "+nrPacienti+" pacienti");
    }
}
