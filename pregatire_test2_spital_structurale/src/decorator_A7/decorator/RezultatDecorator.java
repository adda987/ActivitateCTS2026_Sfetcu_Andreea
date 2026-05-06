package decorator_A7.decorator;

import decorator_A7.clase.RezultatAbstract;

public abstract class RezultatDecorator implements RezultatAbstract {
    private RezultatAbstract rezultat;

    public RezultatDecorator(RezultatAbstract rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public void puneLaDispozitieRezultatul() {
        rezultat.puneLaDispozitieRezultatul();
    }
    public abstract void puneLaDispozitieRezultatulOnline();
}
