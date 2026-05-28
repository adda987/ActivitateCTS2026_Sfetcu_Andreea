package ro.ase.cts.teste;

import org.junit.experimental.categories.Category;
import ro.ase.cts.clase.IPersoana;
import ro.ase.cts.clase.PachetTuristic;
import ro.ase.cts.interfete.BicepCategory;
import ro.ase.cts.interfete.RightCategory;
import ro.ase.cts.teste.mocks.PersoanaFake;
import ro.ase.cts.teste.mocks.PersoanaStub;

import static org.junit.Assert.*;

public class PachetTuristicTest {


    @Category(RightCategory.class)
    @org.junit.Test
    public void testNonAplicaDiscountFake() {
        PersoanaFake persoana=new PersoanaFake();
        persoana.setVarsta(18);
        PachetTuristic pachet=new PachetTuristic(persoana,"Italia",200.0);

        pachet.aplicaDiscountVarstnici(10);
        assertEquals(200,pachet.getPret(),0.01);
    }

    @Category(RightCategory.class)
    @org.junit.Test
    public void testAplicaDiscountFake() {
        PersoanaFake persoana=new PersoanaFake();
        persoana.setVarsta(80);
        PachetTuristic pachet=new PachetTuristic(persoana,"Italia",200.0);

        pachet.aplicaDiscountVarstnici(10);
        assertEquals(180,pachet.getPret(),0.01);
    }

    @Category(BicepCategory.class)
    @org.junit.Test
    public void testAplicaDiscountFakeBoundary(){
        PersoanaFake persoana=new PersoanaFake();
        persoana.setVarsta(65);

        PachetTuristic pachet=new PachetTuristic(persoana,"Italia",200.0);

        pachet.aplicaDiscountVarstnici(10);
        assertEquals(180,pachet.getPret(),0.01);
    }

}