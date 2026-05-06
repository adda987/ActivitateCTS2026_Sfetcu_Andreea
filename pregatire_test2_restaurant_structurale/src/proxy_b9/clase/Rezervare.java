package proxy_b9.clase;

import proxy_b9.proxy.IRezervare;

public class Rezervare implements IRezervare {
    @Override
    public void realizeazaRezervare(Client client, int nrPersoane) {
        System.out.println("Rezervarea realizata pentru clientul: "+client.getNume()+" include un nr de: "+
                +nrPersoane+" persoane");
    }
}
