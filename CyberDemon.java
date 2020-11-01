
/**
 * The CyberDemon class implements a wrapper for the base Demon class with the following 
 * additions:
 * Implements a maximum/minimum strength for the creature type [40/20]
 * Implements a maximum/minimum hitpoint total for the creature type [100/25]
 * 
 * 
 * @author Karen Stagg
 * @version November 09, 2020
 */
public class CyberDemon extends Demon
{
    // instance variables - 
    private static final int MAX_DEMON_STR = 40;
    private static final int MIN_DEMON_STR = 20;
    private static final int MAX_DEMON_HP = 100;
    private static final int MIN_DEMON_HP = 25;
    

    /**
     * Constructor for objects of class CyberDemon -
     * Note that the calling class does not need to know anything about the 
     * requirements of demon minimum and maximum values
     * 
     * The instantiating class asks for a CyberDemon and the cyberDemon class is responsible for
     * return a CyberDemon object with values in the appropriate range
     * 
     */
    public CyberDemon()
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
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR,
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP);   
    }
    
    // attack() - not overridden because CyberDemons generate basic damage
    // takeDamage(int) - not overridden, because CyberDemons take all damage assigned to them
} 