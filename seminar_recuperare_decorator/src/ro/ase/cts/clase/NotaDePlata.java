package ro.ase.cts.clase;

public class NotaDePlata implements NotaDePlataAbstract{

    private double suma;
    private String data;

    public NotaDePlata(double suma, String data) {
        this.suma = suma;
        this.data = data;
    }


    @Override
    public void printeaza() {
        System.out.println("Nota de plata din data : "+this.data+" este in valoare de "+this.suma+" lei");
    }
}
