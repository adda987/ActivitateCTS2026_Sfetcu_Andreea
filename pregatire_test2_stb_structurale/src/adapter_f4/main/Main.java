package adapter_f4.main;

import adapter_f4.softSubteran.AdapterTransportTerestru;
import adapter_f4.softSubteran.SoftTransportSubteran;
import adapter_f4.softTerestru.SoftTransportTerestru;

public class Main {
    public static void inregistreazaCalatorie(SoftTransportSubteran softTransportSubteran){
        softTransportSubteran.areAccesSubteran();
    }

    public static void main(String[] args) {
        SoftTransportSubteran metrou=new SoftTransportSubteran(100);
        metrou.areAccesSubteran();
        SoftTransportTerestru tramvai=new SoftTransportTerestru(1);
        tramvai.valideazaBilet();

        inregistreazaCalatorie(metrou);

        AdapterTransportTerestru transportTerestruAdaptat=new AdapterTransportTerestru(200,tramvai);
        inregistreazaCalatorie(transportTerestruAdaptat);
        transportTerestruAdaptat.areAccesSubteran();
    }
}
