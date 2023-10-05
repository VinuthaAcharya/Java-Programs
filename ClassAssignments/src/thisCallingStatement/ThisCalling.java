package thisCallingStatement;
//Program for this calling statement and this keyword
public class ThisCalling 
{
	int a;
	void num(int a)
	{
		this.a=a;//Here this keyword is used to assign local variable value to global variable
		System.out.println(this.a);
	}
	ThisCalling()
	{
		System.out.println("Hi");
	}
	ThisCalling(String name,int age,double weight)
	{
		this("Welcome All");//Parameterized this calling statement
		System.out.println("I am "+name+"\nMy age is "+age+"\nMy weight is "+weight);
	}
	ThisCalling(String w)
	{
		this();//Non parameterized this calling statement
		System.out.println(w);
	}
	public static void main(String[] args) 
	{
		ThisCalling t=new ThisCalling("Doreman",100,150.45);
		t.num(50);
	}

}
