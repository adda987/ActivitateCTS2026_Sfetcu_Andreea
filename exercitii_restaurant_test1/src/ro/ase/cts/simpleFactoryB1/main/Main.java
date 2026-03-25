package ro.ase.cts.simpleFactoryB1.main;

import ro.ase.cts.simpleFactoryB1.clase.simpleFactory.Factory;
import ro.ase.cts.simpleFactoryB1.clase.simpleFactory.TipDeSupa;
import ro.ase.cts.simpleFactoryB1.clase.supa.ISupa;

public class Main {
    public static void main(String[] args) {
        Factory fabicaSupa=new Factory();
        ISupa supaCiuperci=fabicaSupa.getTipDeSupa(TipDeSupa.CIUPERCI,12,"Andreea");
        supaCiuperci.afiseazaTipSupa();
        ISupa supaLegume=fabicaSupa.getTipDeSupa(TipDeSupa.LEGUME,34,"Alina");
        supaLegume.afiseazaTipSupa();
        ISupa supaVita=fabicaSupa.getTipDeSupa(TipDeSupa.VITA,56,"Denis");
        supaVita.afiseazaTipSupa();

    }
}
