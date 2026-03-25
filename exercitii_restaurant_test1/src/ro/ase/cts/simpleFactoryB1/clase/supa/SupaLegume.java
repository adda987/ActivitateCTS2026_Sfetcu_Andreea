package ro.ase.cts.simpleFactoryB1.clase.supa;

public class SupaLegume implements ISupa{
    private int gramaj;
    private String numeChelner;

    public SupaLegume(int gramaj, String numeChelner) {
        this.gramaj = gramaj;
        this.numeChelner = numeChelner;
    }

    @Override
    public void afiseazaTipSupa() {
        System.out.println("Supa cu legume a fost servita de "+this.numeChelner+
                " si are "+this.gramaj+ "grame");
    }
}
