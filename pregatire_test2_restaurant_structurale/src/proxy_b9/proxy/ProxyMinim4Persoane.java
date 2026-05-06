package proxy_b9.proxy;

import proxy_b9.clase.Client;

public class ProxyMinim4Persoane implements IRezervare{
    private IRezervare rezervare;

    public ProxyMinim4Persoane(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare(Client client, int nrPersoane) {
        if(nrPersoane>=4){
            rezervare.realizeazaRezervare(client,nrPersoane);
        }else{
            System.out.println("Ne pare rau dar nu putem realiza rezervarea din cauza numarului insuficient de persoane");
        }
    }
}
