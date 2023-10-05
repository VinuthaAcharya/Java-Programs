package StringFunctions;
/*"String Functions:

Input : Manish Kumar Tiwari
Output :
Manish
Kumar
Tiwari"*/

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String i=s.nextLine();		
		String o1=i.substring(0, 6);
		String o2=i.substring(7, 12);
		String o3=i.substring(13);
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
}

}
