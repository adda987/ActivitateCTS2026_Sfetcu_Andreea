package ro.ase.bonus.main;

import ro.ase.bonus.clase.Asistent;
import ro.ase.bonus.clase.Curs;
import ro.ase.bonus.clase.Profesor;
import ro.ase.bonus.clase.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Profesor p=new Profesor("Mihai Eminescu",45,"ANG1");

        Student s1=new Student("Feodor Dostoievski",20,"STUD1");
        Student s2=new Student("Jules Verne",20,"STUD2");
        Student s3=new Student("Vasile Alecsandri",20,"STUD3");

        List<Student> listaStudenti=new ArrayList<>();
        listaStudenti.add(s1);
        listaStudenti.add(s2);
        listaStudenti.add(s3);


        Curs c=new Curs("Literatura",5,p,listaStudenti);
        c.studentiSortati();
        c.informatiiCurs();


        Asistent a = new Asistent("Liviu Rebreanu", 40,"AST1");
        a.preda();
    }
}
