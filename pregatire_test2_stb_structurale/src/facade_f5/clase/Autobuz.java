package facade_f5.clase;

public class Autobuz {
    private String nrInmatriculare;
    private Usa usaFata;
    private Usa usaMijloc;
    private Usa usaSpate;

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
        this.usaFata = new Usa("din fata");
        this.usaMijloc = new Usa("de la mijloc");
        this.usaSpate = new Usa("din spate");
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public Usa getUsaFata() {
        return usaFata;
    }

    public Usa getUsaMijloc() {
        return usaMijloc;
    }

    public Usa getUsaSpate() {
        return usaSpate;
    }
}
