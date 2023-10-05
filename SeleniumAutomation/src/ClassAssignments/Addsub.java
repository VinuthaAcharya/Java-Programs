package ClassAssignments;
//Create a program in which we can call non static method by creating an object of a class.
public class Addsub {
	public static void add()
	{
		int a=150;
		int b=250;
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is " +c);
	}
	//Non static method
	public void sub()
	{
		int a=150;
		int b=250;
		int c=a-b;
		System.out.println("Subtraction of "+b+" from "+a+" is " +c);
	}
	public static void main(String[] args) 
	{
		Addsub ab=new Addsub();//creating an object of class Addsub
		add();//static method
		ab.sub();
	}

}
