package adapter_b5.main;

import adapter_b5.softBar.SoftBar;
import adapter_b5.softFactura.AdapterSoftBar;
import adapter_b5.softFactura.SoftFactura;

public class Main {
    public static void printeazaFacturaRestaurant(SoftFactura softFactura){
        softFactura.printeazaFactura();
    }

    public static void main(String[] args) {
        SoftFactura produs=new SoftFactura("carne",1.2);
        printeazaFacturaRestaurant(produs);

        SoftBar bautura=new SoftBar("apa",5);
        bautura.printeazaBonBar();

        AdapterSoftBar bauturaAdaptata=new AdapterSoftBar(bautura);
        printeazaFacturaRestaurant(bauturaAdaptata);
    }
}
