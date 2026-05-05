package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Operator {
    private List<Command> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<>();
    }


    public void inregistreaza(Command comanda){
        comenzi.add(comanda);
    }

    public void executaComanda(){
        if(comenzi.size()>0){
            comenzi.get(0).executa();
        }
    }

    public void stergeComanda(Command comanda){
        comenzi.remove(comanda);
    }
}
