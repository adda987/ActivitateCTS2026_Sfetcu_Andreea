package facade_f5.main;

import facade_f5.clase.Autobuz;
import facade_f5.facade.SistemUsiFacade;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("B100AAA");
        SistemUsiFacade facade=new SistemUsiFacade(autobuz);
        facade.puneToateUsileInModulLiber();
        System.out.println();
        facade.deschideToateUsileFortat();
    }
}
