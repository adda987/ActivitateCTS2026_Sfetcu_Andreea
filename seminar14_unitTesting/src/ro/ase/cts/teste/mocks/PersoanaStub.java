package ro.ase.cts.teste.mocks;

import ro.ase.cts.clase.IPersoana;

public class PersoanaStub implements IPersoana {

    @Override
    public String getSex() {
        return "M";
    }

    @Override
    public int getVarsta() {
        return 67;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
