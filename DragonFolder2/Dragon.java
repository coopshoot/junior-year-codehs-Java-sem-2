public class Dragon 
{
    private String name;
    private int level;
    private boolean canBreatheFire;
    
    // Write the constructor here!
    public Dragon(String theName, int theLevel)
    {
        name = theName;
        level = theLevel;
        canBreatheFire = (level >= 70);
    }
    // Put getters here
    public String getName()
    {
        return name;
    }
    public int getLevel()
    {
        return level;
    }
    public boolean isFireBreather()
    {
        return canBreatheFire;
    }
    // Put other methods here
    public void attack()
    {
        if(canBreatheFire == true)
        {
            System.out.println(">>>>>>>>>>");
            System.out.println(">>>>>>>>>>>>>>");
            System.out.println(">>>>>>>>>>>>>>");
            System.out.println(">>>>>>>>>>");
        }
        else
        {
            System.out.println("~ ~ ~");
        }
    }
    public int gainExperience()
    {
        level += 10;
        if(level >= 70)
        {
            canBreatheFire = true;
        }
        else
        {
            canBreatheFire = false;
        }
        return level;
    }

    // String representation of the object
    public String toString()
    {
        return "Dragon " + name + " is at level " + level;
    }
}
