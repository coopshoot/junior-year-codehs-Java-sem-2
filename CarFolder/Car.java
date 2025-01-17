public class Car {

    // Start here
    private double efficiency;
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;
    
    public Car(double carEfficiency, double carTankCapacity)
    {
        efficiency = carEfficiency;
        tankCapacity = carTankCapacity;
    }
    
    public void addGas()
    {
        gas = tankCapacity;
        System.out.println("Filling up ...");
    }
    public void addGas(double amount)
    {
        gas += amount;
        if(gas > tankCapacity)
        {
            gas = tankCapacity;
        }
        System.out.println("Adding gas ...");
    }
    public double getTotalMilesDriven()
    {
        return totalMilesDriven;
    }
    public void drive(double distance)

    {

        if(canDrive(distance))
        {
            System.out.println("Driving " + distance);
            totalMilesDriven += distance;
            gas -= distance / efficiency;
        }
        else
        {
            System.out.println("Can't drive " + distance + ". That's too far!");
        }

    }   
    public boolean canDrive(double distance)
    {
        return gas >= distance/efficiency;
    }
    public double milesAvailable()
    {
        return efficiency*gas;
    }
    public double getGas()
    {
        return gas;
    }
}
