package ClassAssignments;

public class Constructor_overloading 
{
	Constructor_overloading()
	{
		System.out.println("Constructor without arguments");
	}
	
	Constructor_overloading(int a,double b,String c)
	{
		System.out.println("Constructor with arguments");
	}
	public static void main(String[] args) 
	{
		System.out.println("Constructor Overloading");
		new Constructor_overloading();
		new Constructor_overloading(1,3.4,"Vinutha");
	}

}
