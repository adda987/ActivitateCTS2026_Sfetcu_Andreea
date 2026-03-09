package ro.ase.bonus.main;

import ro.ase.bonus.clase.Asistent;
import ro.ase.bonus.curs.Curs;
import ro.ase.bonus.clase.Profesor;
import ro.ase.bonus.clase.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Profesor profesor=new Profesor("Mihai Eminescu",45,"ANG1");


        List<Student> listaStudenti=new ArrayList<>(List.of(
                new Student("Feodor Dostoievski",20,"STUD1"),
                new Student("Jules Verne",20,"STUD2"),
                new Student("Vasile Alecsandri",20,"STUD3")
        ));


        Curs curs=new Curs("Literatura",5,profesor,listaStudenti);
        curs.sortareStudenti();
        curs.afisareInformatiiCurs();


        Asistent asistent = new Asistent("Liviu Rebreanu", 40,"AST1");
        asistent.preda();
    }
}
