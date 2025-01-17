public class CarTester {

    public static void main(String[] args) {
        //Create a car that gets 20 mpg and has a 15 gallon tank
        Car bug = new Car(20, 15);
        //Fill up the gas tank
        bug.addGas();
        //Check the miles available
        System.out.println("Miles available: " + bug.milesAvailable());
        //Drive 100 miles
        bug.drive(100);
        //Check the miles available
        System.out.println("Miles available: " + bug.milesAvailable());
        //Add 2 gallons to the gas tank
        bug.addGas(2);
        //Check the miles available
        System.out.println("Miles available: " + bug.milesAvailable());
        //Try driving more miles than available by driving 1000 miles
        bug.drive(1000);
        //Drive 200 miles
        bug.drive(200);
        //Check how much gas you have left
        System.out.println("Gas remaining: " + bug.getGas());
        //Print total miles driven
        System.out.println("Total Miles Driven: " + bug.getTotalMilesDriven());
    }
}
