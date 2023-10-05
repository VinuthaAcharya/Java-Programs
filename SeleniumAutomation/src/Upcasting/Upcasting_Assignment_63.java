package Upcasting;
//Create 3 classes(Grand parent,parent,child) and do upcasting and downcasting between Parent and Child class
	class Add
	{
		void add()
		{
			System.out.println("Adding numbers");
		}
	}
	class Sub extends Add
	{
		void sub()
		{
			System.out.println("Subtracting numbers");
		}
	}
	public class Upcasting_Assignment_63 extends Sub
	{
		void child_method()
		{
			System.out.println("Child Method");
		}
	public static void main(String[] args) 
	{
		Sub a=new Upcasting_Assignment_63();//Upcasting 
		a.add();//accessing grand parent class property
		a.sub();//accessing parent class property
		Upcasting_Assignment_63 b=(Upcasting_Assignment_63)a;//Downcasting
		b.add();//using downcasting we can access all the upper level class properties till downcating
		b.sub();
		b.child_method();
	}

}
