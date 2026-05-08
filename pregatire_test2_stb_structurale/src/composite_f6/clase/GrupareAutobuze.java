package composite_f6.clase;

import java.util.ArrayList;
import java.util.List;

public class GrupareAutobuze implements ElementFlota{
    private String denumire;
    private List<ElementFlota> elemente;

    public GrupareAutobuze(String denumire) {
        this.denumire = denumire;
        this.elemente = new ArrayList<>();
    }

    @Override
    public void afiseazaDetalii(String spatiu) {
        System.out.println(spatiu+"Denumire grupa: "+this.denumire);
        for(ElementFlota element:elemente){
            element.afiseazaDetalii(spatiu+"   ");
        }
    }
    public void adaugaElement(ElementFlota element){
        elemente.add(element);
    }
    public void stergeElement(ElementFlota element){
        elemente.remove(element);
    }
    public ElementFlota getElement(int pozitie){
        return elemente.get(pozitie);
    }

}
