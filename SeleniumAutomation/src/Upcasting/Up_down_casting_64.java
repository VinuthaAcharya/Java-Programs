package Upcasting;
//"Create 3 classes(Grand parent,parent,child) and do upcasting and downcasting between Grand Parent and Parent class
class English
{
	void eng_sub()
	{
		System.out.println("English");
	}
}
class Maths extends English
{
	void math_sub()
	{
		System.out.println("Mathematics");
	}
} 
class Up_down_casting_64 extends Maths
{
	void cs_sub()
	{
		System.out.println("Computer science");
	}
	public static void main(String[] args) 
	{
		English e=new Maths();//Upcasting parent class object to grand parent class type
		e.eng_sub();
		Maths m=(Maths)e;//downcasting
		m.eng_sub();
		m.math_sub();
	}

}
