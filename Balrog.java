/**
 * The Balrog class implements a wrapper for the base Demon class with the following 
 * additions:
 * Implements a maximum/minimum strength for the creature type [100/50]
 * Implements a maximum/minimum hitpoint total for the creature type [200/80]
 * Has magical powers that can attack twice each round
 * 
 * @author Karen Stagg
 * @version November 09, 2020
 */
public class Balrog extends Demon
{
    // instance variables - 
    private static final int MAX_DEMON_STR = 100;
    private static final int MIN_DEMON_STR = 50;
    private static final int MAX_DEMON_HP = 200;
    private static final int MIN_DEMON_HP = 80;
    

    /**
     * Constructor for objects of class Balrog -
     * Note that the calling class does not need to know anything about the 
     * requirements of balrog minimum and maximum values
     * 
     * The instantiating class asks for a Balrog and the balrog class is responsible for
     * return a Balrog object with values in the appropriate range
     * 
     */
    public Balrog()
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
    
     /**
     * Allows a Balrog creature to determine how much damage it is causing in this round of battle
     * @return 
    */
    public int attack()
    {
        //Overrides superclass method and calls the super attack() method
        //Ask Demon to compute damage
        int totBalrogDamage = 0; 
        for (int i = 1; i <=2; i++)
        {
            totBalrogDamage += super.attack();
        }
        return totBalrogDamage;
    }
} 