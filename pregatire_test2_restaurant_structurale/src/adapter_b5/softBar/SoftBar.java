package adapter_b5.softBar;

public class SoftBar {
    private String numeBautura;
    private double pret;

    public SoftBar(String numeBautura, double pret) {
        this.numeBautura = numeBautura;
        this.pret = pret;
    }
    public void printeazaBonBar(){
        System.out.println("Bonul de la bar pt bautura: "+this.numeBautura+" este in valoare de: "+this.pret);
    }
}
