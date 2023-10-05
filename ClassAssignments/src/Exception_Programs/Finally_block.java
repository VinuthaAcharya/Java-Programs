package Exception_Programs;

import java.util.InputMismatchException;

public class Finally_block {

	public static void main(String[] args) 
	{
		try
		{
			int a=1/1;
			System.out.println("Try block executed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input Mismatch Exception");
		}
		finally//finally block always executed with try/catch block 
		{
			System.out.println("Finally block executed");
		}
	}

}
