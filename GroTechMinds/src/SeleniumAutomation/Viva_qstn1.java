package SeleniumAutomation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Viva_qstn1 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter integer value ");
		try
		{
		s.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);			
		}
	}

}
