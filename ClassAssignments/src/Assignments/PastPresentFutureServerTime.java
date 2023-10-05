package Assignments;

import java.util.Date;

public class PastPresentFutureServerTime 
{
	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		System.out.println("\nCurrent Date and time is");
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		System.out.println("\n10 days after current Date is");
		Date d3=new Date(d1.getTime()+(1000*60*60*24*10));
		System.out.println(d3);
		System.out.println("\n5 days before current Date is");
		Date d4=new Date(d1.getTime()-(1000*60*60*24*5));
		System.out.println(d4);
	}

}
