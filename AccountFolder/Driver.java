import java.util.Scanner;
public class Driver
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("NEW ACCOUNT:");
        Account acct1 = new Account();
        acct1.setFirst("James");
        acct1.setLast("Bossert");
        acct1.deposit(155.25);
        System.out.println(acct1);
        System.out.print("Enter withdrawal amount for " + acct1.getFirst() + " " + acct1.getLast() + ": ");
        double wd = kb.nextDouble();
        if(!acct1.withdrawal(wd))
        System.out.println(acct1.getFirst() + " has insufficient funds for this withdrawal.");
        else
        System.out.println(acct1.getFirst() + " now has a balance of: " + acct1.getBalance());
        System.out.println(acct1);
        System.out.println();
        System.out.println("NEW ACCOUNT:");
        Account acct2 = new
        Account("Sara","Sanchez",60.00);
        System.out.println(acct2);
        acct2.deposit(20.00);
        System.out.println(acct2);
        System.out.print("Enter withdrawal amount for "+ acct2.getFirst() + " " + acct2.getLast() + ": ");
        wd = kb.nextDouble();
        if(!acct2.withdrawal(wd))
        System.out.println(acct2.getFirst() + " has insufficient funds for this withdrawal.");
        else
        System.out.println(acct2.getFirst() + " now has a balance of: " + acct2.getBalance());
        System.out.println(acct2);
        System.out.println();
        System.out.println("NEW ACCOUNT:");
        Account acct3 = new Account(acct2);
        System.out.println(acct3);
        acct3.setLast("Wilson");
        acct3.deposit(15.00);
        System.out.println(acct3);
        System.out.println();
        System.out.println("NEW ACCOUNT:");
        System.out.print("Enter customer first name: ");
        String first = kb.next();
        System.out.print("Enter customer last name: ");
        String last = kb.next();
        System.out.print("Enter initial deposit amount: ");
        double deposit = kb.nextDouble();
        Account acct4 = new Account(first, last, deposit);
        System.out.println();
        System.out.println("The name of this customer is: " + acct4.getFirst() + " " + acct4.getLast());
        System.out.println("The account number is: " + acct4.getAcctNum());
        System.out.println("The current balance in the account is: " + acct4.getBalance());
        System.out.println();
        System.out.println("List of all customers:");
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
        System.out.println(acct4);
    }
}
