package ClassAssignments;

public class Blocks 
{
	static
	{
		System.out.println("SBI 1 called");
	}
	static
	{
		System.out.println("SBI 2 called");
	}
	
	{
		System.out.println("IIB 1 called");
	}
	
	{
		System.out.println("IIB 2 called");
	}
	Blocks()
	{
		System.out.println("Constructor 1 called");
	}
	Blocks(int a)
	{
		System.out.println("Constructor 2 called");
	}
	void nonstatic()
	{
		System.out.println("Non Static Method called");
	}
	static void static_method()
	{
		System.out.println("Static Method called");
	}
	public static void main(String[] args) 
	{
		static_method();
		Blocks b=new Blocks();
		new Blocks(10);
		b.nonstatic();
		
	}

}
