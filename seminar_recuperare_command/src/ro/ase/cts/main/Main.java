package ro.ase.cts.main;


import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("Andreea",22);
        Pacient pacient2=new Pacient("Denis",12);

        PersonalSpital medic=new Medic("Georgescu");
        PersonalSpital asistenta=new Asistenta("Mincu");

        Command internare=new Internare(medic,pacient);
        Command tratare=new Tratare(asistenta,pacient2);

        Operator operator=new Operator();
        operator.inregistreaza(internare);

        operator.executaComanda();
        operator.inregistreaza(new Tratare(new Asistenta("Valentina"),new Pacient("Daniela",80)));
        operator.executaComanda();
        operator.stergeComanda(internare);

        operator.inregistreaza(tratare);
        operator.executaComanda();


    }
}