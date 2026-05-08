package decorator_f7.main;


import decorator_f7.clase.Bilet;
import decorator_f7.clase.BiletAbstract;
import decorator_f7.decorator.BiletDecorator;
import decorator_f7.decorator.BiletMesajNational;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet=new Bilet(100);
        bilet.printeaza();

        BiletDecorator biletDecorat=new BiletMesajNational(bilet);
        biletDecorat.printeaza();
        biletDecorat.printeazaMesajPersonalizat();
    }
}
