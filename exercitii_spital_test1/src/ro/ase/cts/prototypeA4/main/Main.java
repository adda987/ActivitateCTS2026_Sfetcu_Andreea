package ro.ase.cts.prototypeA4.main;

import ro.ase.cts.prototypeA4.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta1=new Reteta(123,499,true);
        Reteta reteta2=(Reteta) reteta1.clonare();
        System.out.println(reteta1.toString());
        System.out.println(reteta2.toString());

        reteta2.setCodReteta(456);
        reteta2.setCantitateSolutie(200);
        System.out.println(reteta2.toString());
    }
}
