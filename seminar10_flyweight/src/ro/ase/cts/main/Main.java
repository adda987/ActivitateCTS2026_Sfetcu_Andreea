package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.ClientAbstract;
import ro.ase.cts.clase.RegistruClienti;
import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        RegistruClienti registru=new RegistruClienti();
        ClientAbstract client=registru.getClient("Andreea","1234567890","andreea@gmail.com");
        ClientAbstract client2=registru.getClient("Daniela","2345678912","daniela@yahoo.com");

        Rezervare rezervare1=new Rezervare(1,2,15);
        Rezervare rezervare2=new Rezervare(2,5,19);

        client.afiseazaRezervare(rezervare1);
        client2.afiseazaRezervare(rezervare2);
        client2.plateste(rezervare2,50);

        registru.getClient("Andrei","1234567890","andrei@gmail.com").afiseazaRezervare(rezervare1);
        registru.getClient("Andrei","1234567890","andrei@gmail.com").afiseazaRezervare(rezervare2);
        Rezervare rezervare3=new Rezervare(3,4,20);
        registru.getClient("Andrei","1234567890","andrei@gmail.com").afiseazaRezervare(rezervare3);


    }
}
