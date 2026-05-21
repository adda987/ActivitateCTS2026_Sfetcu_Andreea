package ro.ase.cts.teste;

import jdk.jfr.Timestamp;
import org.junit.Test;
import ro.ase.cts.clase.Persoana;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Test
    public void getVarsta() {
        Persoana persoana=new Persoana("Andreea","6040810293421");
        assertEquals(21,persoana.getVarsta());
    }

    @org.junit.Test
    public void testBoundaryGetVarsta(){
        Persoana persoana=new Persoana("Alina","1991231112233");
        assertEquals(26,persoana.getVarsta());
    }

    @org.junit.Test
    public void testBoundaryZiuaCurenta(){
        Persoana persoana=new Persoana("Alina","6000521112233");
        assertEquals(26,persoana.getVarsta());
    }


    @org.junit.Test
    public void testCrossCheckGen(){
        Persoana persoana=new Persoana("Alina","5000521112233");
        String cnp=persoana.CNP;
        assertEquals(cnp.charAt(0)%2==0 ? "F" :"M",persoana.getSex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCNPInvalid(){
        Persoana persoana=new Persoana("Alina","502345678912");
        persoana.checkCNP();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCNPCaractereSpeciale(){
        Persoana persoana=new Persoana("Alina","123456ii89765");
        persoana.checkCNP();
    }

    @Test(timeout=100)
    public void testTime(){
        Persoana persoana=new Persoana("Denis","6040810678745");
        persoana.getVarsta();
    }

    @Test
    public void testOrdineVarste(){
        Persoana persoana1=new Persoana("Andreea","6040810234567");
        Persoana persoana2=new Persoana("Andreea","6090809234567");
        assertTrue(persoana1.getVarsta()>persoana2.getVarsta());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataViitor(){
        Persoana persoana1=new Persoana("Andreea","6270810234567");
        persoana1.getVarsta();
    }

}