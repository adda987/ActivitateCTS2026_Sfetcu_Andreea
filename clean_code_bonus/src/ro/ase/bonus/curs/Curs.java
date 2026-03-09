package ro.ase.bonus.curs;

import ro.ase.bonus.clase.Profesor;
import ro.ase.bonus.clase.Student;

import java.util.Comparator;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private Profesor profesor;
    private List<Student> studenti;

    public Curs(String numeCurs, int credite, Profesor profesor, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti = studenti;
    }


    public void afisareInformatiiCurs(){
        afisareDetaliiMaterie();
        afisareProfesor();
        afisareStudenti();
    }


    private void afisareDetaliiMaterie(){
        System.out.println("Curs: "+numeCurs);
        System.out.println("Credite: "+credite);
    }

    private void afisareProfesor(){
        System.out.println("Profesor: "+profesor.toString());
        profesor.preda();
    }

    private void afisareStudenti(){
        System.out.println("Nr. studenti: "+studenti.size());
        for(Student student: studenti){
            System.out.println(student.toString());
        }
    }

    public void sortareStudenti() {
      studenti.sort(Comparator.comparing(Student::getNume));

    }
}
