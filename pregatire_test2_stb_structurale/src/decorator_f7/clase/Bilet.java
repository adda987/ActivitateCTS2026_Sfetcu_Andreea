package decorator_f7.clase;

public class Bilet implements BiletAbstract{
    private int codBilet;

    public Bilet(int codBilet) {
        this.codBilet = codBilet;
    }

    @Override
    public void printeaza() {
        System.out.println("Biletul are codul: "+this.codBilet);
    }
}
