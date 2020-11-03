
/**
 * The CreatureWar class creates a good army and a bad army of Creatures and
 * has them battle each other to the end.
 * An action report at the end will report on the status of the winner.
 * 
 * To start the game, create a new CreatureWar object.  
 *
 * @author Karen Stagg
 * @version November 09, 2020
 */
public class CreatureWar
{
    // instance variables 
    private Creature[] goodArmy;  // array for good army of 100 creatures
    private Creature[] badArmy;    // array for bad army of 50 creatures
    

    /**
     * Constructor for objects of class CreatureWar
     */
    public CreatureWar()
    {
        goodArmy = new Creature[100];
        badArmy = new Creature[50];
        popGoodArmy();
        popBadArmy();
        war();
    }

    /**
     * Populates the good army of creatures for the given array size, based upon
     * a random assignment
     * 
     * 
     */
    public void popGoodArmy() 
    {
        int random;
        for (int i = 0; i <goodArmy.length; i++)
        {
            random = Randomizer.nextInt(10);
            if (random <= 6)
            {
                goodArmy[i] = new Human();
            }
            else
            if (random > 6 && random <=8)
            {
                goodArmy[i] = new Elf();
            }
            else
            if (random == 9)
            {
                goodArmy[i] = new MegaHobbit();
            }
            else
            if (random == 10)
            {
                goodArmy[i] = new SonicHobbit();
            }    
            System.out.println("goodArmy[ " + i + " ] = " 
                    + goodArmy[i].getClass() + " " + goodArmy[i].toString());
        }
    }
    
    /**
     * Populates the bad army of creatures for the given array size,
     * based upon a random assignment
     * 
     * 
     */
    public void popBadArmy() 
    {
        int random;
        for (int i = 0; i <badArmy.length; i++)
        {
            random = Randomizer.nextInt(25);
            if (random <= 18)
            {
                badArmy[i] = new Human();
            }
            else
            if (random > 18 && random <=24)
            {
                badArmy[i] = new CyberDemon();
            }
            else
            if (random == 25)
            {
                badArmy[i] = new Balrog();
            }
            System.out.println("badArmy[ " + i + " ] = " 
                    + badArmy[i].getClass() + " " + badArmy[i].toString());
        }
    }
    
    /**
     * War conducts battles until either or both the good army or the bad army 
     * run out of combatants, 
     * 
     */
    public void war() 
    {
        int iG = 0;  //seta the index for the good army
        int iB = 0;   // sets the index for the bad army
        while (iG < goodArmy.length && iB <badArmy.length)
        {
            while (goodArmy[iG].isAlive() && badArmy[iB].isAlive())
            {
                battle(iG, iB);
            }    
            if (goodArmy[iG].isKnockedOut())
            {
                iG++;
            }
            if (badArmy[iB].isKnockedOut())
            {
                iB++;
            }
        }
        actionReport();
    }
    
    /**
     * Battle conducts an individual battle amongst goodArmy and badArmy
     * 
     * @param iG the index value for the goodArmy combatant
     * @param iB the index value for the badArmy combatant
     */
    public void battle(int iG, int iB) 
    {
        int goodArmyDamageTaken =badArmy[iB].attack(); 
        int badArmyDamageTaken = goodArmy[iG].attack();
        goodArmy[iG].takeDamage(goodArmyDamageTaken);
        System.out.println("goodArmy[ " + iG + " ] took " +
                     goodArmyDamageTaken + " in damage " + 
                     " health remaining: " + goodArmy[iG].getHealth());
        badArmy[iB].takeDamage(badArmyDamageTaken);             
        System.out.println("badArmy[ " + iB + " ] took " +
                    badArmyDamageTaken + " in damage " +
                    " health remaining: " + badArmy[iB].getHealth());
    }
        
    /**
     * Action Report prints out the final results of the war. 
     * 
     */
    public void actionReport() 
    {
        int goodLeft =0;
        int badLeft = 0;
        for (Creature creature: goodArmy)
            if (creature.isAlive())
            {
                goodLeft++;
            }
        for (Creature creature: badArmy)
            if (creature.isAlive())
            {
                badLeft++;
            }
        System.out.println("******************************************************");
        System.out.println("There are " + goodLeft + " good army combatants left.");
        System.out.println("There are " + badLeft + " bad army combatants left.");
        if (goodLeft > badLeft)
        {
            System.out.println("The good army wins with " + (goodLeft-badLeft) +
                    " combatants left standing!");
        }   
        else
        if (goodLeft<badLeft)
        {   
            System.out.println("The bad army wins with " + (badLeft-goodLeft) +
                    " combatants left standing!");
        }
        else
        {
            System.out.println("Sorry, nobody wins");
         
            
        }   
    }
}    
    


       
        
        
        
        
    