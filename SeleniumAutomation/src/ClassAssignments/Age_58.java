package ClassAssignments;
//Example program for throw and throws
public class Age_58 
{
	public static void main(String[] args) throws ArithmeticException, InterruptedException
	{
		int age=6;
		Thread.sleep(1000);
		if(age>=18)
		{
			System.out.println("Welcome to Google Official Website");
		}
		else
		{
			throw new ArithmeticException("You are still young");
		}
	}

}
