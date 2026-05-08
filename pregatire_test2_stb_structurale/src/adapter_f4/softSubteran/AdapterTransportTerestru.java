package adapter_f4.softSubteran;

import adapter_f4.softTerestru.SoftTransportTerestru;

public class AdapterTransportTerestru extends SoftTransportSubteran {
    private SoftTransportTerestru softTransportTerestru;

    public AdapterTransportTerestru(int codAbonament, SoftTransportTerestru softTransportTerestru) {
        super(codAbonament);
        this.softTransportTerestru = softTransportTerestru;
    }

    @Override
    public void areAccesSubteran() {
        softTransportTerestru.valideazaBilet();
    }
}
