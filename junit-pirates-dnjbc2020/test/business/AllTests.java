package business;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ beforeandaftertest.class, PirateTest.class })
public class AllTests {

}
