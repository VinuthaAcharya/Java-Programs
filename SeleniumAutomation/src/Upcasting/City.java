package Upcasting;
/*"Create 2 Class as City and State.
City has 2 method
1.Cityroad
2.Cityname
State has 2 method
1.Stateroad
2.Statename

Create Upcasting"*/
class State
{
	void statename()
	{
		System.out.println("Maharastra");
	}
	void stateroad()
	{
		System.out.println("NH-48");
	}
}
public class City extends State 
{
void cityname()
{
	System.out.println("Mumbai");
}
void cityroad()
{
	System.out.println("NG colony");
}
	public static void main(String[] args) 
	{
		State s1=(State)new City();//Upcasting-explicitly
		s1.statename();
		s1.stateroad();
		City c1=(City) s1;
		c1.cityname();
		c1.cityroad();
		c1.statename();
		c1.stateroad();
	}

}
