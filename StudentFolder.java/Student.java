public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String school;

    /**
     * Constructors go here.
     * Check out StudentTester.java for an example of how to use
     * this constructor. Make sure your code matches the call in the
     * tester.
     */
     public Student(String fName, String lName, int grade, String theSchool)
     {
         firstName = fName;
         lastName = lName;
         gradeLevel = grade;
         school = theSchool;
     }
          public Student(String fName, String lName, int grade)
     {
         firstName = fName;
         lastName = lName;
         gradeLevel = grade;
         if(gradeLevel >= 9 && gradeLevel <= 12)
         {
             school = "high school";
         }
         else if(gradeLevel >= 6 && gradeLevel <= 8)
         {
             school = "middle school";
         }
         else if(gradeLevel < 6)
         {
             school = "elementary school";
         }
         else
         {
             school = "Not a grade in either primary or secondary school.";
         }
     }
   
   
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     * 
     * Modify the to string to add 'and goes to _____' at the end
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + gradeLevel + " and goes to " + school;
    }
    
    public String getFirstName(){
        return firstName;
    }
}
