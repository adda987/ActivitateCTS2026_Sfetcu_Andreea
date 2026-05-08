package adapter_f4.softTerestru;

public class SoftTransportTerestru {
    private int nrBilet;

    public SoftTransportTerestru(int nrBilet) {
        this.nrBilet = nrBilet;
    }
    public void valideazaBilet(){
        System.out.println("Biletul pentru transportul terestru cu numarul: "+this.nrBilet+" a fost validat");
    }
}
