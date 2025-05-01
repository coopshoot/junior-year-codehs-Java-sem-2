import java.lang.Math;

public class Sphere extends Solid
{
    
    // Code goes here
    private double r;
    public Sphere(String name, double r)
    {
        super(name);
        this.r = r;
    }
    
    public double volume()
    {
        return 1.3333 * Math.PI * Math.pow(r,3);
    }
    
    public double surfaceArea()
    {
        return 4 * Math.PI * Math.pow(r,2);
    }
}
