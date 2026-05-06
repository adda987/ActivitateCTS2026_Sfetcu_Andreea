package decorator_A7.decorator;

import decorator_A7.clase.RezultatAbstract;

public class RezultatOnline extends RezultatDecorator{

    public RezultatOnline(RezultatAbstract rezultat) {
        super(rezultat);
    }

    @Override
    public void puneLaDispozitieRezultatulOnline() {
        System.out.println("Puteti regasi rezultatele online! ");
    }
}
