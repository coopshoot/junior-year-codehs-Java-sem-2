public class Strings extends Instrument
{
    private boolean hasBow;
    
    public Strings(String name, boolean bow)
    {
        super(name, "Strings");
        hasBow = bow;
    }
    
    public boolean getHasBow()
    {
        return hasBow;
    }
    
    public void setHasBow(boolean x)
    {
        hasBow = x;
    }
}
