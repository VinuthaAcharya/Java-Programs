package ClassAssignments;

public class Method_Overloading 
{
	static void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition of two numbers is " +c);
	}
	
	static void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("Addition of three numbers is "+d);
	}
	void add(int i,String j,char k)
	{
		System.out.println(k+" for "+j+", age is "+i);
	}
	public static void main(String[] args) 
	{
		add(10,56);
		add(78,56,10);
		Method_Overloading m=new Method_Overloading();
		m.add(50,"Elephant",'E');
	}

}
