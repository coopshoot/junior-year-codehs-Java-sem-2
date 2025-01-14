public class DragonTester
{
    public static void main(String[] args)
    {
        // Start here!
        Dragon hop = new Dragon("hop", 70);
        Dragon yotti = new Dragon("yotti", 55);
        System.out.println(hop);
        System.out.println(yotti);
        System.out.println(hop.isFireBreather());
        yotti.attack();
        yotti.gainExperience();
        yotti.gainExperience();
        yotti.attack();
    }
}
