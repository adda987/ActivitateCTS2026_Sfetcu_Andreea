package ro.ase.cts.simpleFactoryB1.clase.simpleFactory;

import ro.ase.cts.simpleFactoryB1.clase.supa.ISupa;
import ro.ase.cts.simpleFactoryB1.clase.supa.SupaCiuperci;
import ro.ase.cts.simpleFactoryB1.clase.supa.SupaLegume;
import ro.ase.cts.simpleFactoryB1.clase.supa.SupaVita;

public class Factory {
    public ISupa getTipDeSupa(TipDeSupa tip, int gramaj, String numeChelner){
        switch (tip) {
            case LEGUME:
                return new SupaLegume(gramaj, numeChelner);
            case CIUPERCI:
                return new SupaCiuperci(gramaj, numeChelner);
            case VITA:
                return new SupaVita(gramaj,numeChelner);
            default:
                return null;
        }
    }
}
