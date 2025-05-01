import java.lang.Math;

public class Cylinder extends Solid
{
    
    // Code goes here
    private double r;
    private double h;
    public Cylinder(String name, double r, double h)
    {
        super(name);
        this.r = r;
        this.h = h;
    }
    
    public double volume()
    {
        return Math.PI * Math.pow(r,2) * h;
    }
    
    public double surfaceArea()
    {
        return (2 * Math.PI * r * h )+ (2 * Math.PI * Math.pow(r,2));
    }
}
