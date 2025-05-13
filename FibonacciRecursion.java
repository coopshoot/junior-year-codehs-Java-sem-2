import java.util.*;
public class FibonacciRecursion
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How long do you want your sequence to be?");
        int num = input.nextInt();
        System.out.println();
        for(int i = 0; i < num; i++)
        {
            System.out.println(fibonacci(i));
        }
    }
    
    public static int fibonacci(int x)
    {
        if(x == 0 || x == 1)
        {
            return 1;
        }
        
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
}
