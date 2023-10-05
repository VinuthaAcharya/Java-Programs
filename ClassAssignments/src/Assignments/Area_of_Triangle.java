package Assignments;

public class Area_of_Triangle 
{
	int b,h;
	void triangle_area()
	{
		int area=(b*h)*1/2;
		System.out.println("Area of triangle is "+area+" when breadth and height are "+b+" and "+h+" respectively");
	}
	public static void main(String[] args) 
	{
		Area_of_Triangle a=new Area_of_Triangle();
		a.b=10;
		a.h=15;
		a.triangle_area();
		
	}

}
