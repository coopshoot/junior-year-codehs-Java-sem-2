public class RectangularPrism extends Solid
{
    
    // Code goes here
    private double w;
    private double l;
    private double h;
    
    public RectangularPrism(String name, double w, double l, double h)
    {
        super(name);
        this.w = w;
        this.l = l;
        this.h = h;
    }
    public double getW()
    {
        return w;
    }
    
    public double volume()
    {
        return w * h * l;
    }
    
    public double surfaceArea()
    {
        return 2 * (w * l + h *l + h * w);
    }
    
}
