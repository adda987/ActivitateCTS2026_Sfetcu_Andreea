package facade_b6.clase;

public class Ospatar {
    private String nume;

    public Ospatar(String nume) {
        this.nume = nume;
    }

    public boolean debarasareMasa(Masa masa){
        return masa.isEsteDebarasata();
    }

    public boolean aPusServeteleNoi(Masa masa){
        return masa.isAreServeteleNoi();
    }
}
