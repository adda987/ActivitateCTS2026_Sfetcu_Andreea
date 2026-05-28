package ro.ase.cts.teste;

import org.junit.experimental.categories.Category;
import ro.ase.cts.clase.IPersoana;
import ro.ase.cts.clase.PachetTuristic;
import ro.ase.cts.interfete.BicepCategory;
import ro.ase.cts.interfete.RightCategory;
import ro.ase.cts.teste.mocks.PersoanaStub;

import static org.junit.Assert.*;
public class PachetTuristicTestStub {

    @Category(RightCategory.class)
    @org.junit.Test
    public void testAplicaDiscountStub() {
        IPersoana persoana=new PersoanaStub();
        PachetTuristic pachet=new PachetTuristic(persoana,"Italia",200.0);

        pachet.aplicaDiscountVarstnici(10);
        assertEquals(180,pachet.getPret(),0.01);
    }

    @Category({BicepCategory.class,RightCategory.class})
    @org.junit.Test
    public void testAplicaDiscountStub2() {
        IPersoana persoana=new PersoanaStub();
        PachetTuristic pachet=new PachetTuristic(persoana,"Italia",200.0);

        pachet.aplicaDiscountVarstnici(10);
        assertEquals(180,pachet.getPret(),0.01);
    }

}