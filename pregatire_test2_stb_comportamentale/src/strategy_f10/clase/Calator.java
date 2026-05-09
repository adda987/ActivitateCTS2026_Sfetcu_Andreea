package strategy_f10.clase;


public class Calator {
    private String nume;
    private ModalitateDePlata modalitateDePlata;

    public Calator(String nume) {
        this.nume = nume;
        this.modalitateDePlata = new PlataCardBancar();
    }

    public void setModalitateDePlata(ModalitateDePlata modalitateDePlata) {
        this.modalitateDePlata = modalitateDePlata;
    }
    public void platesteCalatorie(double suma){
        modalitateDePlata.plateste(this.nume,suma);
    }
}
