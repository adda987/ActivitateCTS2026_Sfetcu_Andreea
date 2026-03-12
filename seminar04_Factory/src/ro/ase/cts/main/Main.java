package ro.ase.cts.main;

import ro.ase.cts.clase.mijlocTransport.Autobuz;
import ro.ase.cts.clase.mijlocTransport.MijlocDeTransport;
import ro.ase.cts.clase.mijlocTransport.Tramvai;
import ro.ase.cts.clase.simpleFactory.Factory;
import ro.ase.cts.clase.simpleFactory.TipMijlocDeTransport;

public class Main {
    public static void main(String[]args){
        Factory fabricaTransport=new Factory();
        MijlocDeTransport autobuz= fabricaTransport.getMijlocTransport(TipMijlocDeTransport.AUTOBUZ,"MAN",102);
        autobuz.afiseazaTipTransport();
        MijlocDeTransport tramvai=fabricaTransport.getMijlocTransport(TipMijlocDeTransport.TRAMVAI,"AAA",20);
        tramvai.afiseazaTipTransport();
        MijlocDeTransport troleibuz= fabricaTransport.getMijlocTransport(TipMijlocDeTransport.TROLEIBUZ,"BBB",32);
        troleibuz.afiseazaTipTransport();
    }
}
