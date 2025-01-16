public class DistanceTester
{
    public static void main(String[] args)   
    {
        // Create three Distance objects
        Distance far = new Distance (1700);
        Distance re = new Distance (80);
        Distance small = new Distance (5);
        // Convert one to miles, one to leagues and
        // double one mileage
        double miles = far.toMiles();
        double leagues = re.toLeagues();
        double doubleMiles = small.doubleMiles();
        // Print out the converted values
        // Use the getter!
        System.out.println(far.getKilometers() + "km = " + miles + "miles");
        System.out.println(re.getKilometers() + "km = " + leagues + "leagues");
        System.out.println(small.getKilometers() + "km (one way) = " + doubleMiles + "miles (round trip)");

    }
}
