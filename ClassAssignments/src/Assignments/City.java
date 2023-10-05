package Assignments;

//MultiLevel Inheritance program
class Country
{
	static void country_highway()//static method
	{
		System.out.println("Country Highway");
	}
}
class State extends Country
{
	void state_highway()//non static method
	{
		System.out.println("State Highway");
	}
}
public class City extends State
{
	void city_highway()
	{
		System.out.println("City Highway");
	}
	public static void main(String[] args) 
	{
		City c=new City();
		c.city_highway();//non static method
		c.state_highway();//non static method
		country_highway();//Static method

	}

}
