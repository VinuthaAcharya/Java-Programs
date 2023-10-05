package ClassAssignments;

public class Logical_Operators {

	static void ifblock(int a,int b)
	{
		if(a<b && a!=b)
		{
			System.out.println("Logical Operator AND of If Block Executed");
		}
		else
		{
			System.out.println("Logical Operator AND of If Block not Executed");
		}
		
		if(a<b ||a<=b)
		{
			System.out.println("Logical Operator OR of If Block Executed");
		}
		else
		{
			System.out.println("Logical Operator OR of If Block not Executed");
		}
		
		if(!((a>b)&&(a!=b)))
		{
			System.out.println("Logical Operator ANDNOT of If Block Executed");
		}
		else
		{
			System.out.println("Logical Operator ANDNOT of If Block not Executed");
		}
		
		if(!((a>=b)||(a>b)))
		{
			System.out.println("Logical Operator ORNOT of If Block Executed");
		}
		else
		{
			System.out.println("Logical Operator ORNOT of If Block not Executed");
		}
	}
	public static void main(String[] args) 
	{
	
	ifblock(10,20);
	System.out.println("-------------------------------------------");
	ifblock(20,10);
	}

}
