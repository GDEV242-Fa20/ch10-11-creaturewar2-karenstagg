/**
 * The MegaHobbit class implements a wrapper for the base Hobbit class with the following 
 * additions:
 * Implements a maximum/minimum strength for the creature type [30/10]
 * Implements a maximum/minimum hitpoint total for the creature type [50/20]
 * 
 * 
 * @author Karen Stagg
 * @version November 09, 2020
 */
public class MegaHobbit extends Hobbit
{
    // instance variables - 
    private static final int MAX_HOBBIT_STR = 30;
    private static final int MIN_HOBBIT_STR = 10;
    private static final int MAX_HOBBIT_HP = 50;
    private static final int MIN_HOBBIT_HP = 20;
    

    /**
     * Constructor for objects of class MegaHobbit -
     * Note that the calling class does not need to know anything about the 
     * requirements of demon minimum and maximum values
     * 
     * The instantiating class asks for a MegaHobbit and the megaHobbit class is responsible for
     * return a MegaHobbit object with values in the appropriate range
     * 
     */
    public MegaHobbit()
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
     * @return a value that is the value of the superclass creature attack value plus five
     * times a random value in a range of 1-3.
     */
    public int attack()
    {
        //Overrides superclass method and always adds an extra 5 times a 
        //random value in the range of 1-3
        //Determine the random value 
        int randomVal = Randomizer.nextInt(3);
        //Call the Creature attack() method
        int attackValue = super.attack();
        System.out.println("MegaHobbit damage given: " + 
                          attackValue + " plus extra: " +(5 * randomVal));
        return attackValue + (5 * randomVal);
    }
}
        
    // takeDamage(int) - not overridden, because CyberDemons take all damage assigned to them
