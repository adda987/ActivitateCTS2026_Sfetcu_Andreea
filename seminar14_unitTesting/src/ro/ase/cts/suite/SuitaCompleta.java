package ro.ase.cts.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.teste.PachetTuristicTest;
import ro.ase.cts.teste.PachetTuristicTestStub;

@RunWith(Suite.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PachetTuristicTestStub.class}) //toate cele 5 teste
public class SuitaCompleta {


}
