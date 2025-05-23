import java.util.*;
public class Median
{

    public static void main(String[] args)
    {
        int[] numbers1 = {12, 75, 3, 17, 65, 22};
        System.out.print("The median value of the EVEN array is " + median(numbers1));
        
        int[] numbers2 = {12, 75, 3, 17, 65, 22, 105};
        System.out.print("\nThe median value of the ODD array is " + median(numbers2));
        
    }

    public static double median(int[] arr)
    {
        // your code goes here!
        Arrays.sort(arr);
        int midIndex = arr.length/2;
        double median = 0;
        if(arr.length % 2 == 0)
        {
            int y = arr[midIndex - 1];
            int x = arr[midIndex];
            median = (double)(y + x) / 2;
        }
        else
        {
            median = (arr[midIndex]);
        }
        return median;
    }
}
