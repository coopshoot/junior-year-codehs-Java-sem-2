public class ArrayAverage
{
   private int[] values;

   public ArrayAverage(int[] theValues)
   {
        values = theValues;
   }

   public double getAverage()
   {
     // your code goes here!
        int denom = values.length;
        int num = 0;
        double sum = 0;
        for(int x : values)
        {
            num += x;
            sum = num / (double)denom;
        }
        return sum;
    }
}
