package ro.ase.cts.decorator;

import ro.ase.cts.clase.NotaDePlataAbstract;

public class NotaDePlata1Mai extends NotaDePlataDecorator {

    public NotaDePlata1Mai(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("1 mai fericit!");
    }

}
