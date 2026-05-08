package composite_f6.clase;

public class Autobuz implements ElementFlota{
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void afiseazaDetalii(String spatiu) {
        System.out.println(spatiu+"Autobuz: "+this.producator+" "+this.model+" "+this.nrLocuri);
    }
}
