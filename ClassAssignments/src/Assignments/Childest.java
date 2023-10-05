package Assignments;
//Method Overriding Program
class Parent_Class
{
	void add()
	{
		System.out.println("Adding 3 numbers");
	}
}

public class Childest extends Parent_Class
{
	void add()
	{
		super.add();//calling Parent class method together with child class method using super keyword
		System.out.println("Adding 2 numbers");
	}
	public static void main(String[] args) 
	{
		Childest c=new Childest();
		c.add();
	}

}
