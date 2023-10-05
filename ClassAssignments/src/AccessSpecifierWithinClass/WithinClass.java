package AccessSpecifierWithinClass;
//"Case1:All Access Specifier used program"
public class WithinClass 
{
	public void add()
	{
		System.out.println("Addition");
	}
	private void sub()
	{
		System.out.println("Subtraction");
	}
	protected void mul()
	{
		System.out.println("Multiplication");
	}
	void div()
	{
		System.out.println("Division");
	}
	public static void main(String[] args) 
	{
		WithinClass w=new WithinClass();
		w.add();
		w.sub();
		w.mul();
		w.div();
	}

}
