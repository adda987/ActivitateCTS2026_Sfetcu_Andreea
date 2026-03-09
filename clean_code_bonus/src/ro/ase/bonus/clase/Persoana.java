package ro.ase.bonus.clase;

import ro.ase.bonus.interfete.IPersoana;

public abstract class Persoana implements IPersoana {
    protected String nume;
    protected int varsta;

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }


    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persoana{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
