package observer_f11.clase;

public class CalatorAbonat implements Calator{
    private String nume;

    public CalatorAbonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println("Calatorul "+this.nume+" a primit acest mesaj: "+mesaj);
    }
}
