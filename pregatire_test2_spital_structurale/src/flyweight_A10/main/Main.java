package flyweight_A10.main;

import flyweight_A10.clase.Internare;
import flyweight_A10.clase.Pacient;
import flyweight_A10.clase.PacientAbstract;
import flyweight_A10.clase.RegistruPacienti;

public class Main {
    public static void main(String[] args) {
        RegistruPacienti registruPacienti=new RegistruPacienti();

        PacientAbstract pacient1= registruPacienti.getPacient("Andreea", "1234", "Bucuresti");
        PacientAbstract pacient2= registruPacienti.getPacient("Marian", "5678", "Targoviste");
        PacientAbstract pacient3= registruPacienti.getPacient("Denis", "4321", "DB");
        PacientAbstract pacient4= registruPacienti.getPacient("Maria", "1234", "DB");


        Internare i1=new Internare(1,1,1);
        Internare i2=new Internare(2,2,2);
        Internare i3=new Internare(3,3,3);
        Internare i4=new Internare(4,4,4);

        pacient1.afiseazaInternare(i1);
        pacient2.afiseazaInternare(i2);
        pacient3.afiseazaInternare(i3);
        pacient4.afiseazaInternare(i4);



    }
}
