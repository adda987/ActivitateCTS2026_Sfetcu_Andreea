package ro.ase.cts.prototype_f2.main;

import ro.ase.cts.prototype_f2.clase.MijlocDeTransport;
import ro.ase.cts.prototype_f2.clase.MijlocDeTransportPrototype;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport m1=new MijlocDeTransport("Autobuz","alb",50);
        MijlocDeTransport m2=(MijlocDeTransport) m1.clonare();
        System.out.println(m1.toString());
        System.out.println(m2.toString());

        m2.setTipTransport("Tramvai");
        m2.setCuloare("gri");
        m2.setNrLocuri(37);
        System.out.println(m2.toString());
    }
}
