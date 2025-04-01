import java.util.ArrayList;

public class DonorProgram {

    public static void main(String[] args) {
        // Test List 1
        ArrayList<Donor> donors1 = new ArrayList<>();
        donors1.add(new Donor("Andy", 45.6));
        donors1.add(new Donor("Wade", 102.58));
        donors1.add(new Donor("Jenny", 203.4));
        donors1.add(new Donor("Benson", 22.76));
        donors1.add(new Donor("Sandy", 78.83));
        donors1.add(new Donor("Mandy", 88.53));
        
        
        ArrayList<Donor> donors2 = new ArrayList<>();
        donors2.add(new Donor("Elenore", 304.5));
        donors2.add(new Donor("Carly", 48.87));
        donors2.add(new Donor("Gary", 100));
        donors2.add(new Donor("Hector", 205.21));
        donors2.add(new Donor("Tim", 10.1));
        
        
        System.out.println("Test List 1 Sorted:");
        insertionSort(donors1);
        printDonors(donors1);

        
        System.out.println("\nTest List 2 Sorted:");
        insertionSort(donors2);
        printDonors(donors2);
    }

    public static void insertionSort(ArrayList<Donor> donors)
    {
        for (int i = 1; i < donors.size(); i++) 
        {
            Donor key = donors.get(i);
            int j = i - 1;
            while (j >= 0 && donors.get(j).getAmount() < key.getAmount()) {
                donors.set(j + 1, donors.get(j));
                j = j - 1;
            }
            donors.set(j + 1, key); 
        }
    }

    public static void printDonors(ArrayList<Donor> donors) 
    {
        for (Donor donor : donors) 
        {
            System.out.println(donor);
        }
    }

    static class Donor 
    {
        private String name;
        private double amount;
        
        
        public Donor(String name, double amount) 
        {
            this.name = name;
            this.amount = amount;
        }

        public String getName() 
        {
            return name;
        }

        public double getAmount() 
        {
            return amount;
        }

        public void setName(String name) 
        {
            this.name = name;
        }

        public void setAmount(double amount) 
        {
            this.amount = amount;
        }


        public String toString() {
            return name + " " + amount;
        }
    }
}
