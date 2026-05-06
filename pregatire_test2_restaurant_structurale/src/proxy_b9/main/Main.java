package proxy_b9.main;

import proxy_b9.clase.Client;
import proxy_b9.clase.Rezervare;
import proxy_b9.proxy.IRezervare;
import proxy_b9.proxy.ProxyMinim4Persoane;

public class Main {
    public static void main(String[] args) {
        Client client1=new Client("Andreea","1234567890");
        Client client2=new Client("Daniela","0000000000");

        IRezervare rezervare1=new Rezervare();

        IRezervare proxy=new ProxyMinim4Persoane(rezervare1);
        proxy.realizeazaRezervare(client1,5);
        proxy.realizeazaRezervare(client2,2);
    }
}
