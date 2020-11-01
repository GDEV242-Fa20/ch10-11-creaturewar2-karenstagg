

/**
 * The Human class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * Implements a maximum/minimum hitpoint total for the creature type [30/10]
 * 
 * @author Karen Stagg
 * @version November 09, 2020
 */
public class Human extends Creature
{
    // instance variables 
    private static final int MAX_HUMAN_STR = 18;
    private static final int MIN_HUMAN_STR = 5;
    private static final int MAX_HUMAN_HP = 30;
    private static final int MIN_HUMAN_HP = 10;

    /**
     * Constructor for objects of class Human -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Human and the human class is responsible for
     * return a Human object with values in the appropriate range
     * 
     */
    public Human()
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
            Randomizer.nextInt(MAX_HUMAN_STR-MIN_HUMAN_STR)+MIN_HUMAN_STR,
            Randomizer.nextInt(MAX_HUMAN_HP-MIN_HUMAN_HP)+MIN_HUMAN_HP);   
    }
    
    
    // attack() - not overridden because Humans generate basic damage
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

    
}
