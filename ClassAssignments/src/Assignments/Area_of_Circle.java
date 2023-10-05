package Assignments;

public class Area_of_Circle 
{
	final double pie=3.14;
	void circlearea()
	{
		int r=7;
		double area=pie*r*r;
		System.out.println("Area of a circle is "+area+" when radius is "+r);
	}
	public static void main(String[] args) 
	{
		Area_of_Circle a=new Area_of_Circle();
		a.circlearea();
	}

}
