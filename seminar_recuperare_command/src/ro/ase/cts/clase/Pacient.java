package ro.ase.cts.clase;

public class Pacient {
    private String nume;
    private int varsta;

    public Pacient(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta='").append(varsta).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getNume() {
        return nume;
    }
}
