
/**
 * The Elf class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/8]
 * Has magical powers that double the damage 10% of the time
 * 
 * @author Karen Stagg
 * @version November 09, 2020
 */
public class Elf extends Creature
{
    // instance variables - 
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    

    /**
     * Constructor for objects of class Elf -
     * Note that the calling class does not need to know anything about the 
     * requirements of elf minimum and maximum values
     * 
     * The instantiating class asks for an Elf and the elf class is responsible for
     * return a Elf object with values in the appropriate range
     * 
     */
    public Elf()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        // Editor won't allow for testing on values passed to super because
        // super must be the first statement in the constructor, and editor would also
        // not allow the super to call validating method(s) in order to populate the str 
        // and hp values being passed.
        super(
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR,
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP);   
    }
    
     /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return a value that is the value of the superclass creature attack value, or 10% of
     * the time is a value equal to double of that value.
    */
    public int attack()
    {
        //Overrides superclass method and 10% of the time doubles the damage value
        //Determine if this is a 10% chance, or 1 in 10
        int chance = Randomizer.nextInt(10);
        //Let chance ==1 be the 10% chance
        if (chance == 1)
        {
            return (super.attack() * 2);
        }
        else
        {
            return super.attack();
        } 
    }
    
        
    // takeDamage(int) - not overridden, because Elfs take all damage assigned to them

    
}