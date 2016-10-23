
import myutils.MyUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joan Creus Martin
 */
public class TestJUnit {

    public TestJUnit() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    
    @Test
    public void testInverteixCadena() {
        assertEquals("odnum aloH", MyUtils.inverteix("Hola mundo"));
    }

    @Test
    public void testInverteixCadenaFalse() {
        assertFalse(("caden").equals(MyUtils.inverteix("anedac")));
    }

    @Test
    public void testInverteixCadenaNull() {
        assertNull(MyUtils.inverteix(null));
    }  
  
    @Test
    public void testEdatImpossible() {
        assertEquals(-2, MyUtils.edat(30, 11, 2016), 0);
    }

    @Test
    public void testEdatCorrecto() {
        assertTrue(MyUtils.edat(10, 12, 1995) == 20);
    }

    @Test
    public void testEdatFalso() {
        assertFalse(MyUtils.edat(10, 12, 2017) != -2);
    }

    public void testEdatVerdadero() {
        assertTrue(MyUtils.edat(31, 10, 1800) == 150);
    }
    
      @Test
    public void testNumeroFactorial() {
        assertEquals(24, MyUtils.factorial(4), 0);
    }

    @Test
    public void testNumeroFactorialVerdadero() {
        assertTrue(MyUtils.factorial(4) == 24);
    }

    @Test
    public void testNumeroFactorial0() {
        assertEquals(1, MyUtils.factorial(0), 0);
    }

    @Test
    public void testNumeroFactorialNegativo() {
        assertFalse(MyUtils.factorial(-33) != -1);
    }

    
}
