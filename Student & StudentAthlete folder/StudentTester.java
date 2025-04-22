public class StudentTester
{
    public static void main(String[] args)
    {
        
        /**
         * Create a student with id # 123987, GPA: 2.56
         */
         Student x = new Student("luke", 123987, 2.56);
         
         
         /**
         * Create a student athlete with id # 987456, GPA: 3.47,
         * who plays lacrosse for the varsity team 
         */
         StudentAthlete y = new StudentAthlete("chris", 987456, 3.47, "lacrosse", "varsity");
         
         // Print out both objects
         System.out.println(x);
         System.out.println(y);
    }
}
