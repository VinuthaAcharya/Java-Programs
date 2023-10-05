package thisKeyword;

public class Numbers 
{
	int a;
	double b;
	String name;
	void add(int a,double b,String name)
	{
		this.a=a;
	
		System.out.println(this.a);
	}
	public static void main(String[] args) 
	{
		Numbers n=new Numbers();
		n.add(10,10.5,"Anu");
	}

}
