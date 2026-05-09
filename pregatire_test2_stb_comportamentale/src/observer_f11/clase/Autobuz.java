package observer_f11.clase;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements IAutobuz{
    private String nrInmatriculare;
    private List<Calator> listaCalatori;

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
        this.listaCalatori = new ArrayList<>();
    }

    @Override
    public void aboneazaCalator(Calator calator) {
        listaCalatori.add(calator);
    }

    @Override
    public void dezaboneazaCalator(Calator calator) {
        listaCalatori.remove(calator);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Calator calator: listaCalatori){
            calator.receptioneazaNotificare(mesaj);
        }
    }
    public void pleacaDeLaCapatDeLinie(){
        trimiteNotificare("Autobuzul cu nr de inmatriculare: "+this.nrInmatriculare+" a plecat de la " +
                "capat de linie ");
    }
}
