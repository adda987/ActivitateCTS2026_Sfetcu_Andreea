package ro.ase.builder02.main;

import ro.ase.builder01.clase.AbstractBuilder;
import ro.ase.builder01.clase.Internare;
import ro.ase.builder01.clase.InternareBuilder;
import ro.ase.builder02.clase.AbstractBuilder2;
import ro.ase.builder02.clase.InternareBuilder02;

public class Main {
    public static void main(String[] args) {

        Internare internare1 = new Internare();
        internare1.setNumePacient("Georgel Vasilescu");
        internare1.setPatRabatabil(true);

        Internare internare2 = new Internare();
        internare2.setNumePacient("Georgică");
        internare2.setPatRabatabil(true);

        AbstractBuilder builder = new InternareBuilder("Georgica");
        Internare internare3 = builder.setPatRabatabil(true).build();
        Internare internare4 = builder.setPapuciCamera(true).setNumePacient("Gigel").build();


        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        AbstractBuilder2 builder2 = new InternareBuilder02();
        builder.setMicDejunInclus(true);
        ro.ase.builder02.clase.Internare internare5 = builder2.build("Georgica");
        ro.ase.builder02.clase.Internare internare6 = builder2.build("Gigel");

        internare5.setHalatInterior(true);
        System.out.println(internare5.toString());
        System.out.println(internare6.toString());
    }
}