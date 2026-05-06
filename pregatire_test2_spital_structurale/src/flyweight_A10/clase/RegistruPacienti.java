package flyweight_A10.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruPacienti {
    private Map<String,PacientAbstract> pacienti;

    public RegistruPacienti() {
        this.pacienti = new HashMap<>();
    }
    public PacientAbstract getPacient(String nume,String nrTelefon,String adresa){
        PacientAbstract pacient=pacienti.get(nrTelefon);
        if(!pacienti.containsKey(nrTelefon)){
            pacient=new Pacient(nume,nrTelefon,adresa);
            pacienti.put(nrTelefon,pacient);
        }
        return pacient;
    }
}
