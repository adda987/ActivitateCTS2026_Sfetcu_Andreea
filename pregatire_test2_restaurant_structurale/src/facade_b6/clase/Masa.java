package facade_b6.clase;

public class Masa {
    private int nrMasa;
    private boolean esteLibera;
    private boolean esteDebarasata;
    private boolean areServeteleNoi;


    public Masa(int nrMasa, boolean esteLibera, boolean esteDebarasata, boolean areServeteleNoi) {
        this.nrMasa = nrMasa;
        this.esteLibera = esteLibera;
        this.esteDebarasata = esteDebarasata;
        this.areServeteleNoi = areServeteleNoi;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public boolean isEsteDebarasata() {
        return esteDebarasata;
    }

    public boolean isAreServeteleNoi() {
        return areServeteleNoi;
    }

    public void setEsteLibera(boolean esteLibera) {
        this.esteLibera = esteLibera;
    }
}
