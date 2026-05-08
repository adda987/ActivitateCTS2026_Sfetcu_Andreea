package facade_f5.facade;

import facade_f5.clase.Autobuz;

public class SistemUsiFacade {
    private Autobuz autobuz;

    public SistemUsiFacade(Autobuz autobuz) {
        this.autobuz = autobuz;
    }
    public void puneToateUsileInModulLiber(){
        System.out.println("Autobuz: "+autobuz.getNrInmatriculare()+" toate usile sunt puse in modul liber");
        autobuz.getUsaFata().punereInModulLiber();
        autobuz.getUsaMijloc().punereInModulLiber();
        autobuz.getUsaSpate().punereInModulLiber();
    }

    public void deschideToateUsileFortat(){
        System.out.println("Autobuz: "+autobuz.getNrInmatriculare()+" toate usile sunt deschise fortat");
        autobuz.getUsaFata().deschideFortat();
        autobuz.getUsaMijloc().deschideFortat();
        autobuz.getUsaSpate().deschideFortat();

    }
}
