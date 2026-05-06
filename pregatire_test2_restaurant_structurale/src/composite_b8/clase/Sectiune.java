package composite_b8.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ElementMeniu{
    private String denumire;
    private List<ElementMeniu> subElemente;

    public Sectiune(String denumire) {
        this.denumire = denumire;
        this.subElemente = new ArrayList<>();
    }

    @Override
    public void afiseazaDetalii(String spatiu) {
        System.out.println(spatiu+"Denumire sectiune: "+this.denumire);
        for(ElementMeniu element: subElemente){
            element.afiseazaDetalii(spatiu+"   ");
        }
    }
    public void adaugaElement(ElementMeniu element){
        subElemente.add(element);
    }
    public void stergeElement(ElementMeniu element){
        subElemente.remove(element);
    }
    public ElementMeniu getElement(int pozitie){
        return subElemente.get(pozitie);
    }
}
