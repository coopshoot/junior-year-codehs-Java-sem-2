import java.util.Scanner;

public class CYOA
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // intro
        // sets up the string of if statements
        System.out.println("Mexico or England?");
        String place = input.nextLine();
        //
        // if the place was mexico
        if(place.toUpperCase().substring(0,1).equals("M"))
        {
            // choose a place in Mexico
            System.out.println("choose a destination: Cancun or Mexico City");
            String dest = input.nextLine();
            //if cancun
            if(dest.toUpperCase().substring(0,1).equals("C"))
            {
                System.out.println("Have fun in Cancun, Mexico");
            }
            //if cabo
            if(dest.toUpperCase().substring(0,1).equals("M"))
            {
                System.out.println("Have fun in Mexico City, Mexico");
            }
            //returns either your having fun in cabo or cancun, mexico
        }
        //if the place was england
        else if(place.toUpperCase().substring(0,1).equals("E"))
        {
            //choose either manchester or london
            System.out.println("Choose a Destination: Manchester or London");
            String location = input.nextLine();
            // if location is manchester
            if(location.toUpperCase().substring(0,1).equals("M"))
            {
                System.out.println("Have fun in Manchester, England");
            }
            //if location was london
            if(location.toUpperCase().substring(0,1).equals("L"))
            {
                System.out.println("Have fun in London, England");
            }
            // prints out if your having fun in either london or manchester, England
        }
    }
}
