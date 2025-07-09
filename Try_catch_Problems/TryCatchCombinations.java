// Valid and invalid try-catch-finally combinations
class TryCatchCombinations 
{
    public static void main(String[] args) 
	{
        // Valid Example
        try 
		{
            System.out.println("Try block executed");
        } 
		catch (ArithmeticException e) 
		{
            System.out.println("Catch block executed");
        } 
		finally 
		{
            System.out.println("Finally block executed");
        }

        // Nested try-catch
        try 
		{
            try 
			{
                System.out.println("Nested try block");
            } 
			catch (Exception e) 
			{
                System.out.println("Nested catch block");
            }
        } 
		catch (Exception e) 
		{
            System.out.println("Outer catch block");
        }
    }
}
