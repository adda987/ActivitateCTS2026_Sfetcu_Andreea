package ro.ase.cts.clase;

public interface ClientAbstract {
    void afiseazaRezervare(Rezervare rezervare);
    void plateste(Rezervare rezervare, double taxaPerPersoana);
}
