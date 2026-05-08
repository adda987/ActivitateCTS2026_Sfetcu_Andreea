package decorator_f7.decorator;

import decorator_f7.clase.BiletAbstract;

public class BiletMesajNational extends BiletDecorator{
    public BiletMesajNational(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printeazaMesajPersonalizat() {
        System.out.println("La multi ani!!");
    }
}
