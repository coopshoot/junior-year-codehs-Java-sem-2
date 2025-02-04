public class Account
{
    private String first;
    private String last;
    private int acctNum;
    private double balance;
    private static int num = 99;
    
    public Account()
    {
        first ="";
        last = "";
        num++;
        acctNum = num;
        balance = balance;
    }
    
    public Account(String first, String last, double balance)
    {
        num++;
        acctNum = num;
        this.first = first;
        this.last = last;
        this.balance = balance;
    }
    
    public Account(Account other)
    {
        first = other.getFirst();
        last = other.getLast();
        balance = other.getBalance();
        num++;
        acctNum = num;
        
    }
    public String getFirst()
    {
        return first;
    }
    public void setFirst(String first)
    {
        this.first = first;
    }
    public String getLast()
    {
        return last;
    }
    public void setLast(String last)
    {
        this.last = last;
    }
    public int getAcctNum()
    {
        return acctNum;
    }
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double amount)
    {
        balance += amount;
    }
    public boolean withdrawal(double amount)
    {
        if(amount > this.balance)
        {
            return false;
        }
        else
        {
            balance -= amount;
            return true;
        }
    }
    public String toString()
    {
        String temp = "Customer Name: " + first + " " + last;
        temp+= "\nAccount #: " + acctNum;
        temp+= "\nCurrent Balance: " + balance;
        return temp;
    }
    
    
}
