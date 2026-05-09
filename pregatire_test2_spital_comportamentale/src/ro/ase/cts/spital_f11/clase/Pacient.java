package ro.ase.cts.spital_f11.clase;

public class Pacient {
    private String nume;
    private ModalitateDePlata modalitateDePlata;

    public Pacient(String nume) {
        this.nume = nume;
        this.modalitateDePlata = new PlataCash();
    }

    public void setModalitateDePlata(ModalitateDePlata modalitateDePlata) {
        this.modalitateDePlata = modalitateDePlata;
    }
    public void platesteInternarea(double suma){
        modalitateDePlata.plateste(this.nume,suma);
    }
}
