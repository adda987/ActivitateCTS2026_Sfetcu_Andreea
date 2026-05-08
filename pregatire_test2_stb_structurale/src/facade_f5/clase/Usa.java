package facade_f5.clase;

public class Usa {
    private String pozitie;

    public Usa(String pozitie) {
        this.pozitie = pozitie;
    }
    public void punereInModulLiber(){
        System.out.println("Usa "+this.pozitie+" a fost pusa in modul liber");
    }
    public void deschideFortat(){
        System.out.println("Usa "+this.pozitie+" a fost deschisa fortat");
    }
}
