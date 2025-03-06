import java.util.ArrayList;

public class Odds
{
    public static void main(String[] args)
    {
        ArrayList<Integer> odds = new ArrayList<Integer>();
        // Pre-load the array list with values.
        for(int index = 1; index < 21; index++)
        {
            odds.add(index);
            odds.add(index);
        }
        // Call removeEvens on the ArrayList above
        removeEvens(odds);
        // Print the ArrayList to verify the even numbers have been removed
        for(int i : odds)
        System.out.println(i);
    }
    
    public static void removeEvens(ArrayList<Integer> array)
    {
        int x = 0;
        while(x < array.size())
        {
            if(array.get(x) % 2 == 0)
            {
                array.remove(x);
            }
            else
            {
                x++;
            }
        }
    }
}
