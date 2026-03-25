package ro.ase.cts.builderB2.clase;

public class Rezervare {
    private String numeClient;
    private boolean asezareLaGeam;
    private boolean scaunErgonomic;
    private boolean decorareMasa;
    private boolean muzicaAmbientala;

    public Rezervare(String numeClient, boolean asezareLaGeam, boolean scaunErgonomic, boolean decorareMasa, boolean muzicaAmbientala) {
        this.numeClient = numeClient;
        this.asezareLaGeam = asezareLaGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.decorareMasa = decorareMasa;
        this.muzicaAmbientala = muzicaAmbientala;
    }

    public Rezervare() {
        numeClient="";
        asezareLaGeam=false;
        scaunErgonomic=false;
        decorareMasa=false;
        muzicaAmbientala=false;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public void setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
    }

    public void setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", asezareLaGeam=").append(asezareLaGeam);
        sb.append(", scaunErgonomic=").append(scaunErgonomic);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", muzicaAmbientala=").append(muzicaAmbientala);
        sb.append('}');
        return sb.toString();
    }
}
