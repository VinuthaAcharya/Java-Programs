package ClassAssignments;

public class Country_Contructor 
{
	Country_Contructor()
	{
		System.out.println("Constructor called here");
	}
	
	void add()
	{
		System.out.println("Non static method called here");
	}
	
	static void sub()
	{
		System.out.println("Static method called here");
	}

	public static void main(String[] args) 
	{
		new Country_Contructor();//one type of calling constructor
		Country_Contructor c=new Country_Contructor();//another type of calling constructor
		c.add();
		sub();
	}

}
