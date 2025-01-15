public class Fraction
{
    // Create your instance variables and constructor here
    private int num;
    private int denom;
    
    public Fraction(int numerator, int denominator)
    {
        num = numerator;
        denom = denominator;
    }
    
    
    public int getNumerator() {
        // IMPLEMENT THIS METHOD
        return num;
    }
    
    public int getDenominator() {
        // IMPLEMENT THIS METHOD
        return denom;
    }
    
    public void setNumerator(int x) {
        // IMPLEMENT THIS METHOD
        num = x;
    }
    
    
    public void setDenominator(int x) {
        // IMPLEMENT THIS METHOD
        denom = x;
    }
    
    public void add(Fraction other) {
        // IMPLEMENT THIS METHOD
        num = num * other.getDenominator() + other.getNumerator() * denom;
        denom *= other.getDenominator();
    }
    
