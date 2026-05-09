package command_b15.clase;

public class Masa {
    private int numarMasa;
    private boolean esteRezervata;
    private boolean esteOcupata;

    public Masa(int numarMasa, boolean esteRezervata, boolean esteOcupata) {
        this.numarMasa = numarMasa;
        this.esteRezervata = esteRezervata;
        this.esteOcupata = esteOcupata;
    }
    public void rezervaMasa(){
        if(!esteRezervata && !esteOcupata){
            esteRezervata=true;
            System.out.println("Masa "+this.numarMasa+" a fost rezervata!");
        } else{
            System.out.println("Masa "+this.numarMasa+" nu poate fi rezervata!");
        }
    }
    public void ocupaMasa(){
        if(!esteOcupata){
            esteOcupata=true;
            System.out.println("Masa "+this.numarMasa+" a fost ocupata!");
        } else{
            System.out.println("Masa "+this.numarMasa+" este deja ocupata!");
        }
    }
}
