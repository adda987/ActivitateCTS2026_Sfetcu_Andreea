package decorator_f7.decorator;

import decorator_f7.clase.BiletAbstract;

public abstract class BiletDecorator implements BiletAbstract {
    private BiletAbstract bilet;

    public BiletDecorator(BiletAbstract bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeaza() {
        bilet.printeaza();
    }
    public abstract void printeazaMesajPersonalizat();
}
