package composite_b8.clase;

public class Item implements ElementMeniu{
    private String denumire;
    private double pret;

    public Item(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void afiseazaDetalii(String spatiu) {
        System.out.println(spatiu+"Produsul: "+this.denumire+" are pretul: "+this.pret);
    }
}
