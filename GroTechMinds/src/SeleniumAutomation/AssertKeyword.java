package SeleniumAutomation;

import java.util.Scanner;

public class AssertKeyword {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int age=s1.nextInt();
		assert age>18;
		System.out.println("Hello");
	}

}
