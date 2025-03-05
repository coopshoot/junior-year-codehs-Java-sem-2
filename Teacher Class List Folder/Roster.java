import java.util.ArrayList;

public class Roster
{
    // Implement the student ArrayList 
    // or copy from previous exercise
    static ArrayList<Student> classList = new ArrayList<Student>();
    
    public static void addStudent(String name, int grade)
    {
        // Create Student
        // or copy from previous exercise
        Student newS = new Student(name, grade);
        
        // Add to classList
        // or copy from previous exercise
        classList.add(newS);
    }
    
    
    //Add the static methods here:
    static String getLastStudent()
    {
        int length = classList.size();
        return classList.get(length-1).getName();
    }
    static int getClassSize()
    {
        int size = classList.size();
        return size;
    }
    static void addStudent(int index, String name, int grade)
    {
        Student temp = new Student(name, grade);
        classList.add(index, temp);
    }
    static String getStudent(int index)
    {
        return classList.get(index).getName();
    }

    public static String printClassList()
    {
        String names = "";
        for(Student name: classList)
        {
            names+= name.getName() + "\n";
        }
        return "Student Class List:\n" + names;
    }
}
