package flyweight_f9.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruLinie {
    private Map<Integer,LinieAbstracta> linii;

    public RegistruLinie() {
        this.linii = new HashMap<>();
    }
    public LinieAbstracta getLinie(int nrLinie, String primaStatie, String ultimaStatie){
        LinieAbstracta linie=linii.get(nrLinie);
        if(!linii.containsKey(nrLinie)){
            linie=new Linie(nrLinie,primaStatie,ultimaStatie);
            linii.put(nrLinie,linie);
        }
        return linie;
    }
}
