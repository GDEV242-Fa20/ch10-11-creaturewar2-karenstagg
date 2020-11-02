

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ElfTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElfTest
{
    private Elf elf1;

    /**
     * Default constructor for test class ElfTest
     */
    public ElfTest()
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
        elf1 = new Elf();
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
        assertEquals(9, elf1.getHealth());
        assertEquals(6, elf1.attack());
        assertEquals(true, elf1.isAlive());
        assertEquals(false, elf1.isKnockedOut());
        elf1.takeDamage(5);
        assertEquals(4, elf1.getHealth());
        assertEquals(true, elf1.isAlive());
        assertEquals(false, elf1.isKnockedOut());
        assertEquals(8, elf1.attack());
        assertEquals(2, elf1.attack());
        assertEquals(2, elf1.attack());
        assertEquals(12, elf1.attack());
        assertEquals(7, elf1.attack());
        assertEquals(9, elf1.attack());
        assertEquals(7, elf1.attack());
        assertEquals(6, elf1.attack());
        assertEquals(8, elf1.attack());
        assertEquals(1, elf1.attack());
        assertEquals(16, elf1.attack());
        elf1.takeDamage(3);
        assertEquals(1, elf1.getHealth());
        assertEquals(true, elf1.isAlive());
        assertEquals(false, elf1.isKnockedOut());
        elf1.takeDamage(1);
        assertEquals(0, elf1.getHealth());
        assertEquals(false, elf1.isAlive());
        assertEquals(true, elf1.isKnockedOut());
    }
}


