public class Cube extends RectangularPrism
{
    
    // Code goes here
    public Cube(String name, double w)
    {
        super(name,w,0,0);
    }
    public double volume()
    {
        return super.getW() * super.getW() * super.getW();
    }
    
    public double surfaceArea()
    {
        return 6 * (super.getW() * super.getW());
    }
}
