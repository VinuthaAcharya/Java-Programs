package ClassAssignments;

import java.util.Date;

public class ServerPresentTime 
{
	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());//Parameterized Date constructor called
		System.out.println(d2);
		String formatofdate=d2.toString();
		int length=formatofdate.length();
		System.out.println(length);
		String year=formatofdate.substring(24);
		System.out.println(year);
		String month=formatofdate.substring(4, 7);
		System.out.println(month);
		String date=formatofdate.substring(8, 10);
		String format1=date.concat(month).concat(year);
		System.out.println(format1);
		String format2=date.concat(" ").concat(month).concat(" ").concat(year);
		System.out.println(format2);
		String format3=date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(format3);
		String format4=date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(format4);
	}

}
