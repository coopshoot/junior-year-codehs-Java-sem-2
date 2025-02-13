public class SnapShot
{
    public static void main(String[] args)
    {
        // Start here!
        String[] str = {"Welcome", "to", "the snap shot", "app!"};
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);
        System.out.println(str[3]);
        System.out.println();
        str[0] = "Upgrade";
        str[3] = "premium app!";
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);
        System.out.println(str[3]);
        
    }
}
