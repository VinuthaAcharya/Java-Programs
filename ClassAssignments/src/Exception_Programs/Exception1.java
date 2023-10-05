package Exception_Programs;

public class Exception1 {

	public static void main(String[] args) 
	{
		try 
		{
			int a=1/0;
			System.out.println("Try block executed");
		}
		catch(Exception e)
		{
			System.out.println("Catch block executed");
			System.out.println("Below exception we got \n "+e);
		}
	}

}
