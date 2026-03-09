package ro.ase.bonus.clase;

import ro.ase.bonus.interfete.IPredabil;

public class Asistent extends Persoana implements IPredabil {
    private String idAsistent;

    public String getIdAsistent() {
        return idAsistent;
    }


    @Override
    public void preda(){
        System.out.println(toString()+ (getVarsta()>25? "":"nu")+" poate preda");
    }

    public Asistent(String nume, int varsta, String idAsistent) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistentul {");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", idAsistent='").append(idAsistent).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
