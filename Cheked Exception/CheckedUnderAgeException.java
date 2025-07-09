 
// Custom checked exception example

class UnderAgeException extends Exception
{
	  UnderAgeException()
	  {
		  super("you are under age");
	  }
	  UnderAgeException(String msg)
	  {
		  super(msg);
  	}
}
public class CheckedUnderAgeException    // Cheked Exception Or CompileTime Exception
{
	  public static void main(String [] args)
	  {
		  int age=19;
		  try
		  {
			  if(age<18)
			  {
			  	throw new UnderAgeException("you are not eligible to vote.");
			  }
			  else 
			  {
			  	System.out.println("you can vote.");
			  }
	  	}
	  	catch(UnderAgeException e)
		  {
			  e.printStackTrace();
		  }
	}
} 
