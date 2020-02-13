//Lesly Silva
//Due date 9/4/19
// CECS 277
import java.util.Scanner;

public class Rational
{
    Scanner input = new Scanner(System.in);
    private int numerator;
    private int denominator;
    public static void main(String [] args) // creates objects and calls the methods to run the program
    { 
        Rational R1 = new Rational();
        Rational R2 = new Rational();
        Rational R3 = new Rational();
        R1.inputRational();
        R2.inputRational();
        R3.add(R1, R2);//calls the method
        System.out.println(R1 + " + " + R2 + " = " + R3);
        R3 = R1.sub(R2);// object R2 calls the method
        System.out.println(R1 + " - " + R2 + " = " + R3);
        R3.mul(R1, R2);//calls the method
        System.out.println(R1 + " * " + R2 + " = " + R3);
        R3 = R2.div(R1);// object R2 calls the method
        System.out.println(R1 + " / " + R2 + " = " + R3);
        System.out.println("Real number: "+ R1 + " / " + R2 + " = " + divToDouble(R1, R2));
        
        R1.setNumerator(2);// sets the numerator to 2
        R2.setDenominator(5);//sets the numerator to 5
        
        System.out.println("\nNumerator: " + R1.getNumerator()); //prints the new setted numerator
        System.out.println("Denominator: " + R2.getDenominator());//prints the new setted denominartor
    }
    public Rational()//default constructer sets a variable to numerator and denominator so denomintor doesn't start with zero
    {
        numerator = 0;
        denominator = 1;
    }
    public Rational (int num, int denom) //default consructer sets numerator as num and denominator as den
    {
        numerator = num;
        denominator = denom;
    }
    public int getNumerator()//returns numerator
    {
        return numerator;
    }
    public int getDenominator()//return denominator
    {
        return denominator;
    }
    public void setNumerator(int value)//accepts a value and sets it as the numerator
    {
        numerator = value;//sets the numerator
    }
    public void setDenominator(int value)//accepts a value and sets it as the numerator
    {
        denominator = value; //set the denominator 
    }
    public void inputRational()// ask the user to enter both ratinals
    {
        System.out.print("Enter the fractions Numerator: ");
        numerator = input.nextInt();
        System.out.print("Enter the fractions Denominator:");
        denominator = input.nextInt();
        System.out.println("");
    }
     public String toString()// returns the string representation of the object, java compiler refers to the toString() 
    {
        if (numerator == 0) // if the numertor is 0 then it will return a zero
        {
            return "0";
        }
        else if(denominator < 0)
        {
            return "-" + numerator + "/" +  Math.abs(denominator);
        }
        return numerator + "/" + denominator; 
    }
    private int gcd(int m, int n) // Computes and returns the greatest common divisor of the two positive parameters
    {
        int r;
        while(n!=0)
        {
            r = m % n; 
            m = n;
            n = r;
        }
        return m;
    }
    public void add(Rational R1,Rational R2)// adds both the rationals 
    {
        numerator = (R1.numerator*R2.denominator)+(R2.numerator*R1.denominator);
        denominator = R1.denominator*R2.denominator;
        int num = gcd(numerator, denominator);//stores the gcd vaules in num
        numerator = numerator / num; //divides the numerator by the greates common divisor
        denominator = denominator / num;//divides the numerator by the greates common divisor
    }
    public Rational sub(Rational R)//uses values stored in R2 and default constructor to do the subtraction
    {
         int CommonDenominator = denominator * R.getDenominator();
         int difference = (numerator * R.getDenominator())-(R.getNumerator() * denominator);
         int num = gcd(difference, CommonDenominator);//stores the gcd vaules in num
         difference = difference / num;//divides the numerator by the greates common divisor
         CommonDenominator = CommonDenominator / num;//divides the numerator by the greates common divisor
         return new Rational(difference, CommonDenominator);

    }
    public void mul(Rational R1,Rational R2) //multiplies both the rationals
    {
        numerator = R1.numerator*R2.numerator;
        denominator = R1.denominator*R2.denominator;
        int num = gcd(numerator, denominator);//stores the gcd vaules in num
        numerator = numerator / num;//divides the numerator by the greates common divisor
        denominator = denominator / num;//divides the numerator by the greates common divisor
    }
    public Rational div(Rational R1)//divides both the rationals
    {
        int CommonDenominator = numerator* R1.getDenominator();
        int division = denominator * R1.getNumerator();
        int num = gcd(division, CommonDenominator);//stores the gcd vaules in num
        division /= num;//divides the numerator by the greates common divisor
        CommonDenominator /= num; //divides the numerator by the greates common divisor
        return new Rational (division,CommonDenominator);
    }
    public static double divToDouble(Rational R1,Rational R2)
    {
       double numerator = R1.numerator * R2.denominator;//gets the numerator of the two rationals 
       double denominator = R1.denominator * R2.numerator;//gets the denominator of the two rational
       return numerator/denominator;
    }
}
