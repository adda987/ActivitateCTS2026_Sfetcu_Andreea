package ro.ase.cts.main;

import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.Salon;
import ro.ase.cts.facade.SpitalFacade;

public class Main {
    public static void main(String[] args) {
       Pacient pacient=new Pacient("Andreea",7);
       Medic medic=new Medic("Georgescu");
       Salon salon=Salon.getInstance();


       SpitalFacade spitalFacade=new SpitalFacade(new Medic("Daniela"),Salon.getInstance());
       spitalFacade.interneazaPacient(pacient);
       Pacient pacient2=new Pacient("Alina",2);
       spitalFacade.interneazaPacient(pacient2);

       Pacient pacient3=new Pacient("Denis",5);
       spitalFacade.interneazaPacient(pacient3);

       Pacient pacient4=new Pacient("Ada",8);
       spitalFacade.interneazaPacient(pacient4);
    }
}