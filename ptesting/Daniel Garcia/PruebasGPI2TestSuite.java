package PruebasGPI2;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Daniel García
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({PruebasGPI2.EsferaTest.class, PruebasGPI2.MaximoComunDivisorTest.class})
public class PruebasGPI2TestSuite {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}
