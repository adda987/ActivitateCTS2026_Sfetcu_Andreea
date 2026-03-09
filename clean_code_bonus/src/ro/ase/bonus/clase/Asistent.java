package ro.ase.bonus.clase;

import ro.ase.bonus.interfete.IPredabil;

public class Asistent extends Persoana implements IPredabil {
    private String idAsistent;

    public String getIdAsistent() {
        return idAsistent;
    }

    public void setIdAsistent(String idAsistent) {
        this.idAsistent = idAsistent;
    }

    @Override
    public void preda(){
        if(getVarsta()>25)
            System.out.println("Asistentul poate preda");
        else
            System.out.println("Asistentul nu poate preda");
    }

    public Asistent(String nume, int varsta, String idAsistent) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
    }
}
