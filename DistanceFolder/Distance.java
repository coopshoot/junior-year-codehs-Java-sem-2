public class Distance
{
    private double kilometers;
    
    public Distance(double km)
    {
        kilometers = km;
    }
    public double toMiles()
    {
        return kilometers/(1.609);
    }
    public double toLeagues()
    {
        return kilometers/(5.556);
    }
    public double doubleMiles()
    {
        double doubleMiles = toMiles() * 2;
        return doubleMiles;
    }
    public double getKilometers()
    {
        return kilometers;
    }
}
