import java.util.ArrayList;
public class Billboard
{
    
    private ArrayList<Musician> top10 = new ArrayList<Musician>();
    public void add(Musician artist)
    {
        if(top10.size() < 10 && artist.getIsPlatinum() == true)
        {
            top10.add(artist);
        }
        else if (artist.getIsPlatinum() == false)
        {
            System.out.println("Sorry, " + artist.getName() + " does not qualify for Top 10");
        }
        else if(top10.size() >= 10)
        {
            replace(artist);
        }
    }
    public void replace(Musician artist)
    {
        int lowestIndex = 0;
        for (int i = 0; i < top10.size(); i++) {
            if (top10.get(i).getWeeksInTop40() < top10.get(lowestIndex).getWeeksInTop40()) {
                lowestIndex = i;
            }
        }
        if (artist.getWeeksInTop40() > top10.get(lowestIndex).getWeeksInTop40()) {
            System.out.println("The musician " + top10.get(lowestIndex).getName() + " has been replaced by " + artist.getName() + ".");
            top10.set(lowestIndex, artist);
        } else {
            System.out.println("Sorry, " + artist.getName() + " has less weeks in the Top 40 than the other musicians.");
        }    
    }
    
    
 
 
 
 
    //Don't make alterations to this method!
    public void printTop10()
    {
        System.out.println(top10);
    }
}
