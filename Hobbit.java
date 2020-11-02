/**
 * The Hobbit class implements a wrapper for the base Creature class.
 *  
 * @author Karen Stagg
 * @version November 09, 2020
 */
public abstract class Hobbit extends Creature
{
    /**
     * Create a Hobbit with a given strength and hit point level. 
     * 
     * Heals must never allow for more hit points than the creature started
     * with
     * @param str the strength of the creature, used to calculate damage
     * @param hp the health of the creature at the start of the simulation, 
     * and the current health levels during battle
     */
    public Hobbit(int str, int hp) 
    {
       super(str, hp);
    }
}    
    
    // attack() - not overridden because Hobbits generate basic damage   
    // takeDamage(int) - not overridden, because Demons take all damage assigned to them