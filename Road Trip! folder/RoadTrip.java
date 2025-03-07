import java.util.ArrayList;

public class RoadTrip
{
    // Create a GeoLocation and add it to the road trip
    ArrayList<GeoLocation> geo = new ArrayList<GeoLocation>();
    public void addStop(String name, double latitude, double longitude)
    {
        GeoLocation temp = new GeoLocation(name, latitude, longitude);
        geo.add(temp);
        
    }
    
    // Get the total number of stops in the trip
    public int getNumberOfStops()
    {
        int stops = geo.size();
        return stops;
    }
    
    // Get the total miles of the trip
    public double getTripLength()
    {
        double sum = 0;
        for(int i = 0; i< geo.size(); i++)
        {
            if((i+1) < geo.size())
            {
            sum += geo.get(i).distanceFrom(geo.get(i+1));
            }
        }
        return sum;
    }
    // Return a formatted toString of the trip
    public String toString()
    {
        String temp = "";
        for(int j = 0; j < geo.size();j++)
        {
            temp += (j+1) + ". " + geo.get(j).getName() + " (" + geo.get(j).getLatitude() + ", " + geo.get(j).getLongitude() + ")";
            temp += "\n";
            
        }
        return temp;
    }
}
