public class PersonRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Person one = new Person("Wolfgang Amadeus Mozart" ,"January 27, 1756");
        Student two = new Student("Johann Nepomuk Hummel","November 14, 1778", 10, 4.0);
        System.out.println(one.getName());
        System.out.println(one.getBirthday());
        System.out.println();
        System.out.println(two.getName());
        System.out.println(two.getBirthday());
        System.out.println(two.getGrade());
        System.out.println(two.getGpa());
    }
}
