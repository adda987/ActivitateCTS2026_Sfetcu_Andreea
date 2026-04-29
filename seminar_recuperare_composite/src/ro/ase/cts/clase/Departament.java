package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String numeDepartament;
    private List<Structura> subStructuri;

    public Departament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
        this.subStructuri = new ArrayList<>();
    }

    @Override
    public void afiseazaDetalii(String spatii) {
        System.out.println(spatii+ "Nume departament: "+this.numeDepartament);
        for( Structura structura: subStructuri){
            structura.afiseazaDetalii(spatii+"   ");
        }
    }

    public void adaugaStructura(Structura structura){
        subStructuri.add(structura);
    }
    public void stergeStructura(Structura structura){
        subStructuri.remove(structura);
    }
    public void getStructura(int pozitie){
        subStructuri.get(pozitie);
    }
}
