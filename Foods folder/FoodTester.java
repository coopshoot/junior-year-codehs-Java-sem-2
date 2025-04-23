public class FoodTester
{
    public static void main(String[] args)
    {
        // Test each of your classes
        Food rice = new Food("Rice", 100);
        Fruit apple = new Fruit("Apple", 100, "Red", true,"C");
        HealthyFood pear = new HealthyFood("Pear", 100, "Fruit", "Green");
        System.out.println(rice.toString());
        System.out.println(apple.toString());
        System.out.println(pear.toString());
        // Make an object of each type
        // Use the getters to verify the fields are set correctly
    }
}
