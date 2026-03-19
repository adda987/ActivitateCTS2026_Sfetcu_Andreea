package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelDeMancare;

public interface FelDeMancareFabrica {
    public FelDeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj,String denumire,int calorii);

    public FelDeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj,String denumire);

}
