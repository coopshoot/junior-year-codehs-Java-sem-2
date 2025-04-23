public class Instrument
{
    private String family;
    private String name;
    
    public Instrument(String name, String family)
    {
        this.family = family;
        this.name = name;
    }
    
    public String getFamily()
    {
        return family;
    }
    
    public void setFamily(String x)
    {
        family = x;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String w)
    {
        name = w;
    }
    
    public String toString()
    {
        return name + " is a member of the " + family + " family.";
    }
}
