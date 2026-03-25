package ro.ase.cts.builderB2.clase;

public interface AbstractBuilder {
    Rezervare build(String numeClient);
    AbstractBuilder setAsezareLaGeam(boolean asezareLaGeam);
    AbstractBuilder setScaunErgonomic(boolean scaunErgonomic);
    AbstractBuilder setDecorareMasa(boolean decorareMasa);
    AbstractBuilder setMuzicaAmbientala(boolean muzicaAmbientala);
}
