public class Dog
{
    private String name;
    private String breed;
    private boolean hasShots;

    // Add your constructors here
    public Dog(String theName, String theBreed, boolean hasHadShots)
    {
        name = theName;
        breed = theBreed;
        hasShots = hasHadShots;
    }
    public Dog(String name2, String breed2)
    {
        name = name2;
        breed = breed2;
        hasShots = false;
    }
    public String toString(){
        String output = "Name: " + name;
        output += "\nBreed: " + breed;
        
        if(hasShots)
        {
            output += "\nUp to date on shots!";
        }
        else
        {
            output += "\nMissing shots";
        }
        
        return output;
    }
}
