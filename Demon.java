
/**
 * The Demon class implements a wrapper for the base Creature class with the following additions

 * Has magical powers that add 50 to the damage 5% of the time.
 * 
 * @author Karen Stagg
 * @version November 09, 2020
 */
public abstract class Demon extends Creature
{
    /**
     * Create a Demon with a given strength and hit point level. 
     * 
     * Heals must never allow for more hit points than the creature started
     * with
     * @param str the strength of the creature, used to calculate damage
     * @param hp the health of the creature at the start of the simulation, 
     * and the current health levels during battle
     */
    public Demon(int str, int hp) 
    {
       super(str, hp);
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
        //Call the Creature attack() method
        int attackValue = super.attack();
        if (chance == 1)
        {
            System.out.println("Demon plus 50 damage given: " + (attackValue +50));
            return attackValue + 50;
        }
        else
        {
            System.out.println("Demon regular damage given: " + attackValue);
            return attackValue;
        }    
    }
}    
    
        
    // takeDamage(int) - not overridden, because Demons take all damage assigned to them