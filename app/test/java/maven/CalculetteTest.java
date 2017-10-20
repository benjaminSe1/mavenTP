package maven;

import junit.framework.TestCase;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CalculetteTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CalculetteTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CalculetteTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testAddition(){
        Calculette c1 = new Calculette();
        int test = c1.add(1,1);
        assertEquals(test, 2);
    }
}
