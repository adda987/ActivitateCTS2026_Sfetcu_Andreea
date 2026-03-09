package ro.ase.bonus.clase;

import java.util.List;

public class Curs {
    private String nume_curs;
    private int credite;
    private Profesor profesor;
    private List<Student> studenti;

    public Curs(String nume_curs, int credite, Profesor profesor, List<Student> studenti) {
        this.nume_curs = nume_curs;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti = studenti;
    }

    public String getNume_curs() {
        return nume_curs;
    }

    public void setNume_curs(String nume_curs) {
        this.nume_curs = nume_curs;
    }

    public int getCredite() {
        return credite;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public void informatiiCurs(){
        System.out.println("Curs: "+nume_curs);
        System.out.println("Credite: "+credite);
        System.out.println("Profesor: "+profesor);
        profesor.preda();
        System.out.println("Nr.studenti: "+studenti.size());
        for(int i=0;i<studenti.size();i++)
            System.out.println("Studentul "+i+" "+ studenti.get(i).getNume()+" "+studenti.get(i).getVarsta());


        }
    public void studentiSortati() {
        for(int i=0;i<studenti.size();i++)
            for(int j=i+1;j<studenti.size();j++)
                if(studenti.get(i).getNume().compareTo(studenti.get(j).getNume())<0){
                    Student a=studenti.get(i);
                    studenti.set(i,studenti.get(j));
                    studenti.set(j,a);
                }

    }
}
