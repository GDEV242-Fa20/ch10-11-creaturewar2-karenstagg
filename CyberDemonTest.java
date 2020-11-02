

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CyberDemonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CyberDemonTest
{
    private CyberDemon cyberDem1;

    /**
     * Default constructor for test class CyberDemonTest
     */
    public CyberDemonTest()
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
        cyberDem1 = new CyberDemon();
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
        assertEquals(81, cyberDem1.getHealth());
        assertEquals(30, cyberDem1.attack());
        assertEquals(true, cyberDem1.isAlive());
        assertEquals(false, cyberDem1.isKnockedOut());
        cyberDem1.takeDamage(50);
        assertEquals(31, cyberDem1.getHealth());
        assertEquals(true, cyberDem1.isAlive());
        assertEquals(false, cyberDem1.isKnockedOut());
        assertEquals(26, cyberDem1.attack());
        assertEquals(79, cyberDem1.attack());
        assertEquals(8, cyberDem1.attack());
        cyberDem1.takeDamage(32);
        assertEquals(-1, cyberDem1.getHealth());
        assertEquals(false, cyberDem1.isAlive());
        assertEquals(true, cyberDem1.isKnockedOut());
    }
}

