package ro.ase.cts.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.interfete.BicepCategory;
import ro.ase.cts.interfete.RightCategory;
import ro.ase.cts.teste.PachetTuristicTest;
import ro.ase.cts.teste.PachetTuristicTestStub;

@RunWith(Categories.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PachetTuristicTestStub.class})
@Categories.IncludeCategory(RightCategory.class)
@Categories.ExcludeCategory(BicepCategory.class)
public class SuitaPersonalizata {
}
