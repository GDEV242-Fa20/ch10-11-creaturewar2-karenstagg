

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SonicHobbitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SonicHobbitTest
{
    private SonicHobbit sonicHob1;

    /**
     * Default constructor for test class SonicHobbitTest
     */
    public SonicHobbitTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        sonicHob1 = new SonicHobbit();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testProcess()
    {
        assertEquals(56, sonicHob1.getHealth());
        assertEquals(1, sonicHob1.attack());
        assertEquals(true, sonicHob1.isAlive());
        assertEquals(false, sonicHob1.isKnockedOut());
        sonicHob1.takeDamage(50);
        assertEquals(6, sonicHob1.getHealth());
        assertEquals(true, sonicHob1.isAlive());
        assertEquals(false, sonicHob1.isKnockedOut());
        assertEquals(10, sonicHob1.attack());
        assertEquals(54, sonicHob1.attack());
        sonicHob1.takeDamage(6);
        assertEquals(0, sonicHob1.getHealth());
        assertEquals(false, sonicHob1.isAlive());
        assertEquals(true, sonicHob1.isKnockedOut());
    }
}

