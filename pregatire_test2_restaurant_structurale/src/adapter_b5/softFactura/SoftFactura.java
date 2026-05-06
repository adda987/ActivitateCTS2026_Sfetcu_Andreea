package adapter_b5.softFactura;

public class SoftFactura {
    private String numeProdus;
    private double pret;

    public SoftFactura(String numeProdus, double pret) {
        this.numeProdus = numeProdus;
        this.pret = pret;
    }
    public SoftFactura(){}

    public void printeazaFactura(){
        System.out.println("Factura pentru produsul: "+this.numeProdus+" este in valoare de: "+this.pret);
    }
}
