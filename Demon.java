
/**
 * The Demon class implements a wrapper for the base Creature class with the following additions

 * Has magical powers that add 50 to the damage 5% of the time.
 * 
 * @author Karen Stagg
 * @version November 09, 2020
 */
public abstract class Demon extends Creature
{
    private int str;        // The strength of this creature
    private int max_hp;     // The maximum hit points the creature can have (used if healing enabled)
    private int hp;         // the current number of hit points the creature has
    
    /**
     * default constructor - this should never actually run.
     * It is the job of dervived classes to set up the proper number of hit points and 
     * strength for the subclass
     */
    public Demon()
    {
        str=10;
        hp=10;
        max_hp = hp;
    }
    
    /**
     * Create a Demon with a given strength and hit point level. 
     * Store max hitpoints to allow for healing to be implemented later
     * Heals must never allow for more hit points than the creature started
     * with
     * @param str the strength of the creature, used to calculate damage
     * @param hp the health of the creature at the start of the simulation, 
     * and the current health levels during battle
     */
    public Demon(int str, int hp) 
    {
       this.str = str;
       this.hp = hp;
       max_hp  = hp;
    }
        
     /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * 
     * @return a value that is either the superclass creature attack value, or 5% of the time
     * a value that is 50 more than that value.
    */
    public int attack()
    {
        //Overrides superclass method and 5% of the time adds 50 to the damage value
        //Determine if this is a 5% chance, or 1 in 20
        int chance = Randomizer.nextInt(20);
        //Let chance ==1 be the 5% chance
        if (chance == 1)
        {
            return (super.attack() + 50);
        }
        else
        {
            return super.attack();
        }    
    }
}    
    
        
    // takeDamage(int) - not overridden, because Elfs take all damage assigned to them