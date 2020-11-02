

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HumanTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HumanTest
{
    private Human human1;

    

    /**
     * Default constructor for test class HumanTest
     */
    public HumanTest()
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
        human1 = new Human();
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
    public void testAttack()
    {
        assertEquals(2, human1.attack());
        assertEquals(5, human1.damage());
        assertEquals(18, human1.getHealth());
        assertEquals(true, human1.isAlive());
        assertEquals(false, human1.isKnockedOut());
        human1.takeDamage(10);
        assertEquals(8, human1.getHealth());
        assertEquals(true, human1.isAlive());
        assertEquals(false, human1.isKnockedOut());
        human1.takeDamage(10);
        assertEquals(-2, human1.getHealth());
        assertEquals(false, human1.isAlive());
        assertEquals(true, human1.isKnockedOut());
    }

    @Test
    public void testProcess()
    {
        assertEquals(25, human1.getHealth());
        assertEquals(8, human1.attack());
        assertEquals(true, human1.isAlive());
        assertEquals(false, human1.isKnockedOut());
        human1.takeDamage(10);
        assertEquals(15, human1.getHealth());
        assertEquals(true, human1.isAlive());
        assertEquals(false, human1.isKnockedOut());
        assertEquals(5, human1.attack());
        assertEquals(3, human1.attack());
        assertEquals(2, human1.attack());
        assertEquals(6, human1.attack());
        assertEquals(7, human1.attack());
        assertEquals(9, human1.attack());
        assertEquals(5, human1.attack());
        human1.takeDamage(10);
        assertEquals(5, human1.getHealth());
        assertEquals(true, human1.isAlive());
        assertEquals(false, human1.isKnockedOut());
        human1.takeDamage(4);
        assertEquals(true, human1.isAlive());
        assertEquals(false, human1.isKnockedOut());
        human1.takeDamage(1);
        assertEquals(false, human1.isAlive());
        assertEquals(true, human1.isKnockedOut());
    }
}


