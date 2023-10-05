package Hirarchical_Inheritance;

public class Child2 extends Parent
{
	void DebitCard()
	{
		System.out.println("Debit Card");
	}
	public static void main(String[] args) 
	{
		Child2 c=new Child2();
		c.Login();
		c.DebitCard();

	}

}
