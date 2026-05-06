package decorator_A7.main;

import decorator_A7.clase.RezultatAbstract;
import decorator_A7.clase.RezultatPrintat;
import decorator_A7.decorator.RezultatDecorator;
import decorator_A7.decorator.RezultatOnline;

public class Main {
    public static void main(String[] args) {
        RezultatAbstract rezultat1=new RezultatPrintat(100,"10 august");
        RezultatAbstract rezultat2=new RezultatPrintat(200,"6 decembrie");
        RezultatAbstract rezultat3=new RezultatPrintat(300,"19 noiembrie");
        RezultatAbstract rezultat4=new RezultatPrintat(400,"17 decembrie");

        rezultat1.puneLaDispozitieRezultatul();
        rezultat2.puneLaDispozitieRezultatul();

        System.out.println("-------Decorator---------");

        RezultatDecorator rezultatDecorat=new RezultatOnline(rezultat3);
        rezultatDecorat.puneLaDispozitieRezultatul();
        rezultatDecorat.puneLaDispozitieRezultatulOnline();

        RezultatDecorator rezultatDecorat2=new RezultatOnline(rezultat4);
        rezultatDecorat2.puneLaDispozitieRezultatul();
        rezultatDecorat2.puneLaDispozitieRezultatulOnline();
    }
}
