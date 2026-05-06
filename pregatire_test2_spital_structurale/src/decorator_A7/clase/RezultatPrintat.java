package decorator_A7.clase;

public class RezultatPrintat implements RezultatAbstract{
    private int cod;
    private String data;

    public RezultatPrintat(int cod, String data) {
        this.cod = cod;
        this.data = data;
    }

    @Override
    public void puneLaDispozitieRezultatul() {
        System.out.println("Rezultatul medical cu codul: "+this.cod+" a fost emis la data de: "+this.data);
    }
}
