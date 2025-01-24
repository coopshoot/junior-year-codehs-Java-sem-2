public class Randomizer
{
    public static int nextInt()
    {
        //Implement this method to return a random number from 1-10
        int randInteger = (int)(Math.random() * (9 + 1) + 1);
        return randInteger;
    }
    
    public static int nextInt(int min, int max)
    {
        //Implement this method to return a random integer between min and max
        int randInteger = (int)(Math.random() * (min) + min);
        return randInteger;
    }
}
