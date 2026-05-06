package flyweight_A10.clase;

public class Pacient implements PacientAbstract{
    private String nume;
    private String nrTelefon;
    private String adresa;

    public Pacient(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public void afiseazaInternare(Internare internare) {
        System.out.println("Pacientul: "+this.nume+" are internarea: "+internare.toString());
    }

}
