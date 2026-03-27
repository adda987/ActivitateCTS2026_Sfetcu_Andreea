package ro.ase.cts.simpleFactoryA2.clase;

public class Brancardier implements PersonalSpital{
    private String nume;
    private int nrPacienti;

    public Brancardier(String nume, int nrPacienti) {
        this.nume = nume;
        this.nrPacienti = nrPacienti;
    }

    @Override
    public void afiseazaTipPersonalSpital() {
        System.out.println("Brancardierul cu numele "+nume+" are "+nrPacienti+" pacienti");
    }
}
