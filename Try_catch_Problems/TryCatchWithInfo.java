// Displaying exception information (moved to a method)
class ExceptionInfo 
{
    	public static void displayDetails(ArithmeticException ae) 
	{
        	System.out.println("Exception Information:");

        	System.out.println("Using printStackTrace():");
        	ae.printStackTrace();

        	System.out.println("Using toString():");
        	System.out.println(ae.toString());

        	System.out.println("Using getMessage():");
        	System.out.println(ae.getMessage());
    	}
}

class TryCatchWithInfo 
{
   	public static void main(String[] args) 
	{
        	try 
		{
            		int a = 100, b = 0, c;
            		c = a / b;
            		System.out.println(c);
        	} 
		catch (ArithmeticException ae) 
		{
            		ExceptionInfo.displayDetails(ae);
       		}
    	}
}
