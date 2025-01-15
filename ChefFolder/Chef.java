public class Chef
{
    private String name;
    private String resturant;
    private Meal bestMeal;
    
    public Chef(String theName, String theResturant, Meal theBestMeal)
    {
        name = theName;
        resturant = theResturant;
        bestMeal = theBestMeal;
    }
    public String getName()
    {
        return name;
    }
    public String getRestaurant()
    {
        return resturant;
    }
    public String getMealName()
    {
        return bestMeal.getName();
    }
    public int getMealServings()
    {
        return bestMeal.getNumberOfServing();
    }
    public String getMealCourse()
    {
        return bestMeal.getCourse();
    }
    
    public String toString()
    {
        return "Chef " + name + " works at " + resturant + " and is best known for " + bestMeal;
    }
    
}
