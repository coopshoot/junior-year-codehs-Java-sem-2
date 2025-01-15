public class RectangleTester
{
    public static void main(String[] args)
    {
        // Make some objects and print out their
        // areas and perimeters
        Rectangle x = new Rectangle(10,4);
        Rectangle y = new Rectangle(6, 14);
        System.out.println(x);
        System.out.println(y);
        System.out.println(x.getArea());
        System.out.println(y.getPerimeter());
    }
}
