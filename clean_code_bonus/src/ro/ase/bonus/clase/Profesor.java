package ro.ase.bonus.clase;

import ro.ase.bonus.interfete.IPersoana;
import ro.ase.bonus.interfete.IPredabil;

public class Profesor extends Persoana implements IPredabil {
    private String idAngajat;

    public Profesor(String nume, int varsta, String idAngajat) {
        super(nume, varsta);
        this.idAngajat = idAngajat;
    }

    public String getIdAngajat() {
        return idAngajat;
    }

    public void setIdAngajat(String idAngajat) {
        this.idAngajat = idAngajat;
    }

    @Override
    public void preda(){
        System.out.println("Profesorul preda.");
    }


}
