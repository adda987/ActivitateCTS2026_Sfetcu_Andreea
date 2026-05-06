package composite_b8.main;

import composite_b8.clase.ElementMeniu;
import composite_b8.clase.Item;
import composite_b8.clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        ElementMeniu meniu=new Sectiune("Meniu");

        ElementMeniu startere=new Sectiune("startere");
        ElementMeniu bauturi=new Sectiune("bauturi");
        ElementMeniu deserturi=new Sectiune("deserturi");

        ElementMeniu apa=new Item("apa",5);
        ElementMeniu cola=new Item("cola",7);

        ElementMeniu tort=new Item("tort",45);

        ((Sectiune) meniu).adaugaElement(startere);
        ((Sectiune) meniu).adaugaElement(bauturi);
        ((Sectiune) meniu).adaugaElement(deserturi);

        ((Sectiune) bauturi).adaugaElement(apa);
        ((Sectiune) bauturi).adaugaElement(cola);

        ((Sectiune) deserturi).adaugaElement(tort);

        meniu.afiseazaDetalii("");

    }
}
