public class FirstArray
{
    public static void main(String[] args)
    {
      // Create the 3 arrays here
        String[] name = {"Las Vegas", "Minsk", "Sao Paulo"};
        int[] pop = {667501, 2038822, 12330000};
        double[] sun = {8.11, 1.36, 6.05};
      // Print all 3 arrays according to the output in the description
      System.out.println(name[0] + "'s population is " + pop[0] + ".");
      System.out.println(name[1] + "'s population is " + pop[1]+ ".");
      System.out.println(name[2] + "'s population is " + pop[2]+ ".");
      System.out.println();
      System.out.println("The least amount of sunshine " + name[0] + " gets is " + sun[0] + " hours a day.");
      System.out.println("The least amount of sunshine " + name[1] + " gets is " + sun[1] + " hours a day.");
      System.out.println("The least amount of sunshine " + name[2] + " gets is " + sun[2] + " hours a day.");
    
    }
}
