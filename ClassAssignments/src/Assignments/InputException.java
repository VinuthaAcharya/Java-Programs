package Assignments;
import java.util.Scanner;
//Generate InputMismatchException with scanner methods
public class InputException 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		/*int a=s.nextInt();
		byte b=s.nextByte();
		short c=s.nextShort();
		long d=s.nextLong();*/
		boolean e=s.nextBoolean();
		/*float f=s.nextFloat();
		double g=s.nextDouble();
		String h=s.next();*/
		s.close();
	}

}
