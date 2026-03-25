package ro.ase.cts.builderB2.clase;

public class RezervareBuilder implements AbstractBuilder{
    private String numeClient;
    private boolean asezareLaGeam;
    private boolean scaunErgonomic;
    private boolean decorareMasa;
    private boolean muzicaAmbientala;

    public RezervareBuilder() {
        asezareLaGeam=false;
        scaunErgonomic=false;
        decorareMasa=false;
        muzicaAmbientala=false;
    }

    @Override
    public Rezervare build(String numeClient) {
        return new Rezervare(numeClient,asezareLaGeam,scaunErgonomic,decorareMasa,muzicaAmbientala);
    }

    @Override
    public AbstractBuilder setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam=asezareLaGeam;
        return this;
    }

    @Override
    public AbstractBuilder setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic=scaunErgonomic;
        return this;
    }

    @Override
    public AbstractBuilder setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa=decorareMasa;
        return this;
    }

    @Override
    public AbstractBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala=muzicaAmbientala;
        return this;
    }
}
