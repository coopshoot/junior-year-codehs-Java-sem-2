import java.util.ArrayList;
import java.util.Scanner;

public class FantasyFootball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> availablePlayers = new ArrayList<String>();
        addPlayers(availablePlayers);
        ArrayList<String> x = new ArrayList<String>();
        String temp = "";
        int size = availablePlayers.size();
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter name of player to add: ");
            temp = input.nextLine();
            int search = search(availablePlayers, temp);
            if(search == -1)
            {
                
                i--;
                System.out.println(temp + " is not an available player.\n");
            }
            else
            {
                x.add(availablePlayers.get(search));
                availablePlayers.remove(availablePlayers.indexOf(temp));
                System.out.println("Successfully added player");
            }
        }
        System.out.println("Final Team Roster: " );
        for(int j = 0; j < 5; j++)
        {
            System.out.println(x.get(j));
        }
        
    }
    
    public static int search(ArrayList<String> array, String player)
    {
        int i = 0;
        while(i < array.size())
        {
            String ele = array.get(i);
            if(ele.equals(player))
            {
                return i;
            }
            else
            {
                i++;
            }
        }
        return -1;
    }
    
    public static void addPlayers(ArrayList<String> array)
    {
        //Feel free to add names of your favorite players to this list!
        //But make sure you DON'T remove any players from it!
        array.add("Cam Newton");
        array.add("Antonio Brown");
        array.add("Leveon Bell");
        array.add("Patrick Mahomes");
        array.add("Saquon Barkley");
        array.add("Mike Evans");
        array.add("Odell Beckham Jr.");
        array.add("Travis Kelce");
        array.add("Baker Mayfield");
        array.add("Michael Thomas");
        array.add("Julio Jones");
        array.add("Ezekial Elliott");
        array.add("Alvin Kamara");
        array.add("Davante Adams");
        array.add("Aaron Rogers");
    }
}
