package ro.ase.cts.spital_f11.clase;

public class PlataCash implements ModalitateDePlata{
    @Override
    public void plateste(String numePacient, double suma) {
        System.out.println("Pacientul "+numePacient+" a platit cash suma de: "+suma);

    }
}
