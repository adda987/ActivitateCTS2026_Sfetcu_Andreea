package proxy_f8.proxy;

public class ProxyAutobuzNoapte implements IAutobuz{
    private IAutobuz autobuz;

    public ProxyAutobuzNoapte(IAutobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if(autobuz.getNrCalatori()>0){
            autobuz.opresteInStatie();
        }else{
            System.out.println("Autobuzul: "+autobuz.getNrInmatriculare()+" nu va opri in statie din cauza numarului " +
                    "insuficient de persoane");
        }
    }

    @Override
    public String getNrInmatriculare() {
        return autobuz.getNrInmatriculare();
    }

    @Override
    public int getNrCalatori() {
        return autobuz.getNrCalatori();
    }
}
