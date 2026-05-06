package adapter_b5.softFactura;

import adapter_b5.softBar.SoftBar;

public class AdapterSoftBar extends SoftFactura {
    private SoftBar softBar;

    public AdapterSoftBar(SoftBar softBar) {
        this.softBar = softBar;
    }


    @Override
    public void printeazaFactura() {
        softBar.printeazaBonBar();
    }
}
