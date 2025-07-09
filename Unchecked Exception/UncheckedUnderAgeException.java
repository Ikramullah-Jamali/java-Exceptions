
// Custom unchecked exception example

class UnderAgeException extends RuntimeException
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
class UncheckedUnderAgeException // Uncheked Exception Or Runtime Exception
{
  	public static void main(String [] args) 
	  {
		  int age=16;
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
		  System.out.println("hello");
	  }
}
