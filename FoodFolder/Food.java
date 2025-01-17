public class Food
{
        //Declare instance variables
        private String name;
        private int calories;
        
        //Create Food Constructor
        public Food(String n, int c)
        {
            name = n;
            calories = c;
        }
        
        //Add getter and setter methods for calories
        
        public int getCalories()
        {
            return calories;
        }
        public void setCalories(int x)
        {
            calories = x;
        }
        
        //Add getter and setter methods for name
        public String getName()
        {
            return name;
        }
        public void setName(String x)
        {
            name = x;
        }
        
        //Add toString method
        public String toString()
        {
            return name + " have " + calories + " calories.";
        }
}
