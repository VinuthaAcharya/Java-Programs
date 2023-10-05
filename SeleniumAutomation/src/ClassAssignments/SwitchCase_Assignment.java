package ClassAssignments;

import java.util.Scanner;

//Switch case Program
public class SwitchCase_Assignment 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the case value ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a)
		{
			case 1:
				System.out.println("Case one");
				break;
			case 2:
				System.out.println("Case Two");
				break;
			case 3:
				System.out.println("Case Three");
				break;
			default://this will be executed only when any above case is not executed
				System.out.println("I am the default Case");
				break;
		}
	}

}
