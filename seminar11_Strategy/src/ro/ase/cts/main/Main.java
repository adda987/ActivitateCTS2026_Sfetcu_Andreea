package ro.ase.cts.main;

import ro.ase.cts.clase.ModSustinereExamen;
import ro.ase.cts.clase.ProbaOrala;
import ro.ase.cts.clase.ProbaScrisa;
import ro.ase.cts.clase.Student;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Andreea");
        student.examinare();

        System.out.println("\n------\n");
        student.setStrategie(new ProbaOrala());
        student.examinare();

        System.out.println("\n------\n");
        student.setStrategie(new ProbaScrisa());
        student.examinare();
    }
}