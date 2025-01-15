public class Meal
{
    private String name;
    private String course;
    private int serving;
    public Meal(String theName, String theCourse, int theServing)
    {
        name = theName;
        course = theCourse;
        serving = theServing;
    }
    public String getName()
    {
        return name;
    }
    public String getCourse()
    {
        return course;
    }
    public int getNumberOfServing()
    {
        return serving;
    }
    
    
    
    
    
    public String toString()
    {
        return name + " (" + course + ")";
    }
}
