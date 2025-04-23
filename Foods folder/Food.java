public class Food
{
    private String name;
    private int calories;
    
    public Food (String foodName, int calories)
    {
        name = foodName;
        this.calories = calories;
    }
    public String getName()
    {
        return name;
    }
    
    public int getCalories()
    {
        return calories;
    }
    
    public String toString()
    {
        return name + " has " + calories + " calories";
    }
}
