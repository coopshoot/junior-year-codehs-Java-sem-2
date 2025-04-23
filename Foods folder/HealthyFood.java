public class HealthyFood extends Food
{
    private String group;
    private String color;
    
    public HealthyFood(String foodName, int calories, String foodGroup, String foodColor)
    {
        super(foodName,calories);
        group = foodGroup;
        color = foodColor;
        
    }
    public String getGroup()
    {
        return group;
    }
    public String getColor()
    {
        return color;
    }
}
