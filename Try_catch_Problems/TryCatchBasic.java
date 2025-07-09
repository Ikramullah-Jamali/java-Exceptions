// Basic try-catch demo
public class TryCatchBasic 
{
    public static void main(String[] args) 
    {
        int a = 100, b = 0, c;
        try 
        {
            c = a / b;
            System.out.println("Ans: " + c);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("You cannot divide by zero");
        }
        System.out.println("Program continues after handling exception.");
    }
}
