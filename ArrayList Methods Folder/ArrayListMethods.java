import java.util.ArrayList;

public class ArrayListMethods
{
    public static void print(ArrayList<Double> list)
    {
        for(double t : list)
        System.out.println(t);
    }
    public static void condense(ArrayList<Double> x)
    {
        for(int i = 0; i < x.size(); i++)
        {
            x.set(i, x.get(i)*x.get(i+1));
            x.remove(i+1);
        }
    }
    public static void duplicate(ArrayList<Double> dupe)
    {
        ArrayList<Double> temp = new ArrayList<Double>();
        for(int u = 0; u<dupe.size();u++)
        {
            temp.add(u, dupe.get(u));
        }
        for(double j: temp)
        {
            dupe.add(j);
        }
    }
}
