package ro.ase.cts.prototypeA4.clase;

public class Reteta implements RetetaPrototype{
    private int codReteta;
    private int cantitateSolutie;
    private boolean esteCompensata;

    private Reteta(){
    }

    public Reteta(int codReteta, int cantitateSolutie, boolean esteCompensata) {
        this.codReteta = codReteta;
        if(cantitateSolutie<500) {
            this.cantitateSolutie = cantitateSolutie;
        }else{
            this.cantitateSolutie=450;
        }
        if(esteCompensata) {
            this.esteCompensata = esteCompensata;
        }else{
            this.esteCompensata=true;
        }
    }

    public void setCodReteta(int codReteta) {
        this.codReteta = codReteta;
    }

    public void setCantitateSolutie(int cantitateSolutie) {
        this.cantitateSolutie = cantitateSolutie;
    }

    public void setEsteCompensata(boolean esteCompensata) {
        this.esteCompensata = esteCompensata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("codReteta=").append(codReteta);
        sb.append(", cantitateSolutie=").append(cantitateSolutie);
        sb.append(", esteCompensata=").append(esteCompensata);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public RetetaPrototype clonare() {
        Reteta reteta=new Reteta();
        reteta.codReteta=this.codReteta;
        reteta.cantitateSolutie=this.cantitateSolutie;
        reteta.esteCompensata=this.esteCompensata;
        return reteta;
    }
}
