public class StudentTester
{
    public static void main(String[] args)
    {
        Student alan = new Student("Alan", "Turing", 11, "Liberty High School");
        Student ada = new Student("Ada", "Lovelace", 5);
        StudentClub dinoClub = new StudentClub(alan, "Dino Club");
        
        System.out.println(dinoClub);
        
        
    }
}
