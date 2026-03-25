package ro.ase.cts.simpleFactoryB1.clase.supa;

public class SupaVita implements ISupa{
    private int gramaj;
    private String numeChelner;

    public SupaVita(int gramaj, String numeChelner) {
        this.gramaj = gramaj;
        this.numeChelner = numeChelner;
    }

    @Override
    public void afiseazaTipSupa() {
        System.out.println("Supa cu vita a fost servita de "+this.numeChelner+
                " si are "+this.gramaj+ "grame");
    }
}
