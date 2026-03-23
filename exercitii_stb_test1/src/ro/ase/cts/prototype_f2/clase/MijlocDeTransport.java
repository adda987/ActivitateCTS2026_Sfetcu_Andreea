package ro.ase.cts.prototype_f2.clase;

public class MijlocDeTransport implements MijlocDeTransportPrototype{
    private String tipTransport;
    private String culoare;
    private int nrLocuri;

    private MijlocDeTransport() {
    }

    public MijlocDeTransport(String tipTransport, String culoare, int nrLocuri) {
        if(tipTransport=="Autobuz" || tipTransport=="Tramvai" || tipTransport=="Troleibuz"){
            this.tipTransport = tipTransport;}
        else{
            this.tipTransport="Autobuz";
        }
        this.culoare = culoare;
        if(nrLocuri<57) {
            this.nrLocuri = nrLocuri;
        }else{
            this.nrLocuri=56;
        }
    }

    public void setTipTransport(String tipTransport) {
        this.tipTransport = tipTransport;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MijlocDeTransport{");
        sb.append("tipTransport='").append(tipTransport).append('\'');
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public MijlocDeTransportPrototype clonare() {
        MijlocDeTransport mijloc=new MijlocDeTransport();
        mijloc.tipTransport=this.tipTransport;
        mijloc.nrLocuri=this.nrLocuri;
        mijloc.culoare=this.culoare;
        return mijloc;
    }
}
