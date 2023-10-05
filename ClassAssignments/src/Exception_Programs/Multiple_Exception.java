package Exception_Programs;

import java.util.InputMismatchException;

public class Multiple_Exception 
{
	public static void main(String[] args) 
	{
		try
		{
			int a=1/0;
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
	}

}
