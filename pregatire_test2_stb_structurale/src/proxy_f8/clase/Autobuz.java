package proxy_f8.clase;

import proxy_f8.proxy.IAutobuz;

public class Autobuz implements IAutobuz {
    private String nrInmatriculare;
    private int nrCalatori;

    public Autobuz(String nrInmatriculare, int nrCalatori) {
        this.nrInmatriculare = nrInmatriculare;
        this.nrCalatori = nrCalatori;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul: "+this.nrInmatriculare+" opreste in statie");
    }
}
