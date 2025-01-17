import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        Food burger = new Food("Hamburger", 600);
        Food fries = new Food("Fries", 350);
        Food coke = new Food("Coke", 200);
        System.out.println(burger);
        System.out.println("How many would you like?");
        int x = input.nextInt();
        System.out.println();
        System.out.println(fries);
        System.out.println("How many would you like?");
        int x2 = input.nextInt();
        System.out.println();
        System.out.println(coke);
        System.out.println("How many would you like?");
        int x3 = input.nextInt();
        System.out.println();
        int total = burger.getCalories()*x + fries.getCalories()*x2 + coke.getCalories()*x3;
        System.out.println("Your meal will have a total of " + total + "calories");
        
    }
}import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        Food burger = new Food("Hamburger", 600);
        Food fries = new Food("Fries", 350);
        Food coke = new Food("Coke", 200);
        System.out.println(burger);
        System.out.println("How many would you like?");
        int x = input.nextInt();
        System.out.println();
        System.out.println(fries);
        System.out.println("How many would you like?");
        int x2 = input.nextInt();
        System.out.println();
        System.out.println(coke);
        System.out.println("How many would you like?");
        int x3 = input.nextInt();
        System.out.println();
        int total = burger.getCalories()*x + fries.getCalories()*x2 + coke.getCalories()*x3;
        System.out.println("Your meal will have a total of " + total + "calories");
        
    }
}
