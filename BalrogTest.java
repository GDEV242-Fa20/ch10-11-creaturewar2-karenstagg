

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BalrogTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BalrogTest
{
    private Balrog balrog1;

    /**
     * Default constructor for test class BalrogTest
     */
    public BalrogTest()
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
        balrog1 = new Balrog();
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
        assertEquals(90, balrog1.getHealth());
        assertEquals(98, balrog1.attack());
        assertEquals(true, balrog1.isAlive());
        assertEquals(false, balrog1.isKnockedOut());
        balrog1.takeDamage(50);
        assertEquals(40, balrog1.getHealth());
        assertEquals(true, balrog1.isAlive());
        assertEquals(false, balrog1.isKnockedOut());
        assertEquals(143, balrog1.attack());
        assertEquals(76, balrog1.attack());
        assertEquals(110, balrog1.attack());
        assertEquals(137, balrog1.attack());
        assertEquals(93, balrog1.attack());
        assertEquals(92, balrog1.attack());
        assertEquals(92, balrog1.attack());
        assertEquals(92, balrog1.attack());
        assertEquals(96, balrog1.attack());
        assertEquals(114, balrog1.attack());
        assertEquals(85, balrog1.attack());
        assertEquals(76, balrog1.attack());
        assertEquals(98, balrog1.attack());
        assertEquals(89, balrog1.attack());
        assertEquals(141, balrog1.attack());
        assertEquals(57, balrog1.attack());
        assertEquals(118, balrog1.attack());
        assertEquals(97, balrog1.attack());
        assertEquals(121, balrog1.attack());
        balrog1.takeDamage(35);
        assertEquals(5, balrog1.getHealth());
        assertEquals(true, balrog1.isAlive());
        assertEquals(false, balrog1.isKnockedOut());
        balrog1.takeDamage(10);
        assertEquals(-5, balrog1.getHealth());
        assertEquals(false, balrog1.isAlive());
        assertEquals(true, balrog1.isKnockedOut());
    }
}





