import java.lang.Math;

public class Pyramid extends Solid
{
    
    // Code goes here
    private double w;
    private double l;
    private double h;
    private double hSW;
    private double hSL;
    public Pyramid(String name, double w, double l, double h)
    {
        super(name);
        this.w = w;
        this.l = l;
        this.h = h;
        this.hSW = Math.pow(Math.pow(h, 2) + Math.pow(l /2, 2), 0.5);
        this.hSL = Math.pow(Math.pow(h, 2) + Math.pow(w /2, 2), 0.5);
    }
    
    public double volume()
    {
        return (w*h*l)/3;
    }
    
    public double surfaceArea()
    {
        return l * w + hSW * w + hSL * l;
    }
    
    
}
