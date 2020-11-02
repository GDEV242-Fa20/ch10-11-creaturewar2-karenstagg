

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MegaHobbitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MegaHobbitTest
{
    private MegaHobbit megaHobb1;

    /**
     * Default constructor for test class MegaHobbitTest
     */
    public MegaHobbitTest()
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
        megaHobb1 = new MegaHobbit();
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
        assertEquals(34, megaHobb1.getHealth());
        assertEquals(21, megaHobb1.attack());
        assertEquals(true, megaHobb1.isAlive());
        assertEquals(false, megaHobb1.isKnockedOut());
        megaHobb1.takeDamage(35);
        assertEquals(-1, megaHobb1.getHealth());
        assertEquals(false, megaHobb1.isAlive());
        assertEquals(true, megaHobb1.isKnockedOut());
    }
}



