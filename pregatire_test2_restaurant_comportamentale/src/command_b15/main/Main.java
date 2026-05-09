package command_b15.main;
import command_b15.clase.*;

public class Main {
    public static void main(String[] args) {
        Operator operator=new Operator();

        Masa masa1=new Masa(1,false,false);
        Masa masa2=new Masa(2,false,true);
        Masa masa3=new Masa(3,true,true);

        Command comanda1=new Rezervare(masa1);
        Command comanda2=new Ocupare(masa2);
        Command comanda3=new Rezervare(masa3);

        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda2);
        operator.adaugaComanda(comanda3);

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

    }
}
