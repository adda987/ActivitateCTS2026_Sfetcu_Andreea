package flyweight_f9.clase;

public class Linie implements LinieAbstracta{
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void afiseazaAutobuzPeLinie(Autobuz autobuz) {
        System.out.println(autobuz.toString()+
                " circula pe linia: "+this.nrLinie+
                ", de la statia: "+this.primaStatie+
                " pana la statia: "+this.ultimaStatie   );
    }
}
