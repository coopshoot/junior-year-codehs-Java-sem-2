public class Wind extends Instrument
{
    private boolean hasReed;
    
    public Wind(String n, String f, boolean reed)
    {
        super(n,f);
        hasReed = reed;
    }
    
    public boolean getHasReed()
    {
        return hasReed;
    }
    
    public void setHasBow(boolean x)
    {
        hasReed = x;
    }
 
