package ro.ase.cts.teste.mocks;

import ro.ase.cts.clase.IPersoana;

public class PersoanaFake implements IPersoana {
    private String sex;
    private int varsta;
    private boolean checkCNP;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCnp(boolean checkCNP) {
        this.checkCNP = checkCNP;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String getSex() {
        return this.sex;
    }

    @Override
    public int getVarsta() {
        return this.varsta;
    }

    @Override
    public boolean checkCNP() {
        return this.checkCNP;
    }
}
