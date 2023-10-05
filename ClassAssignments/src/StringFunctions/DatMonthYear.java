package StringFunctions;

public class DatMonthYear 
{
	public static void main(String[] args) 
	{
		String input="12 DEC 2021";
		String date=input.substring(0, 2);
		String month=input.substring(3, 6);
		String year=input.substring(7);
		System.out.println("Input value is----- "+input);
		System.out.println("Here date will be----- "+date);
		System.out.println("Here month will be---- "+month);
		System.out.println("Here year will be----- "+year);
	}

}
