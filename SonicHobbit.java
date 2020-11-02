/**
 * The SonicHobbit class implements a wrapper for the base Hobbit class with the following 
 * additions:
 * Implements a maximum/minimum strength for the creature type [40/20]
 * Implements a maximum/minimum hitpoint total for the creature type [60/30]
 * 
 * 
 * @author Karen Stagg
 * @version November 09, 2020
 */
public class SonicHobbit extends Hobbit
{
    // instance variables - 
    private static final int MAX_HOBBIT_STR = 40;
    private static final int MIN_HOBBIT_STR = 20;
    private static final int MAX_HOBBIT_HP = 60;
    private static final int MIN_HOBBIT_HP = 30;
    

    /**
     * Constructor for objects of class SonicHobbit -
     * Note that the calling class does not need to know anything about the 
     * requirements of demon minimum and maximum values
     * 
     * The instantiating class asks for a Sonicobbit and the sonicHobbit class is responsible for
     * return a SonicHobbit object with values in the appropriate range
     * 
     */
    public SonicHobbit()
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
            Randomizer.nextInt(MAX_HOBBIT_STR-MIN_HOBBIT_STR)+MIN_HOBBIT_STR,
            Randomizer.nextInt(MAX_HOBBIT_HP-MIN_HOBBIT_HP)+MIN_HOBBIT_HP);   
    }
    
    /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * 
     * @return a value that is either the superclass creature attack value, or 25% of the time
     * a value that is 25 more than that value.
    */
    public int attack()
    {
        //Overrides superclass method and 25% of the time adds 25 to the damage value
        //Determine if this is a 25% chance, or 1 in 4
        int chance = Randomizer.nextInt(4);
        //Let chance ==1 be the 25% chance
        //Call the Creature attack() method
        int attackValue = super.attack();
        if (chance == 1)
        {
            System.out.println("SonicHobbit plus 25 damage given: " + (attackValue +25));
            return attackValue + 25;
        }
        else
        {
            System.out.println("SonicHobbit regular damage given: " + attackValue);
            return attackValue;
        }    
    }
    
}
        
    // takeDamage(int) - not overridden, because CyberDemons take all damage assigned to them