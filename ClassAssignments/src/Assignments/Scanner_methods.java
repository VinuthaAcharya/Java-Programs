package Assignments;
import java.util.Scanner;
public class Scanner_methods 
{
	static void addition()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first value for addition:");
		int a=s.nextInt();
		System.out.println("Enter the second value for addition:");
		int b=s.nextInt();
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+c);
	}
		static void multiplication()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the second value for multiplication:");
		int a=s.nextInt();
		System.out.println("Enter the second value for multiplication:");
		int b=s.nextInt();
		int c=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is "+c);
	}
	static void subtraction()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the second value for subtraction:");
		int a=s.nextInt();
		System.out.println("Enter the second value for subtraction:");
		int b=s.nextInt();
		int c=a-b;
		System.out.println("Subtraction of "+b+" from "+a+" is "+c);
	}
	static void division()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the second value for division:");
		int a=s.nextInt();
		System.out.println("Enter the second value for division:");
		int b=s.nextInt();
		int c=a/b;
		System.out.println(+a+" divided by "+b+" is "+c);
	}
	public static void main(String[] args) 
	{
		addition();
		subtraction();
		multiplication();
		division();
	}
}
