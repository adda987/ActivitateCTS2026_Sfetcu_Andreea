package ro.ase.cts.clase;

import ro.ase.cts.proxy.ISpital;

public class Spital implements ISpital {
    private String nume;

    public Spital(String nume) {
        this.nume = nume;
    }

    public void interneazaPacient(Pacient pacient){
        System.out.println("Pacientul "+pacient.getNume()+" este internat in spitalul "+this.nume);
    }

}
