package Interface_programs;
//"Program for Interface and Class with the keyword implements (Class 21)
interface International
{
	void IH();
}
interface National
{
	void NH();
	
}
class State implements National,International
{
	void SH()
	{
		System.out.println("State Highway");
	}

	public void IH() 
	{
		System.out.println("International Highway");
	}

	public void NH() 
	{
		System.out.println("National Highway");
	}
}
class City extends State
{
	void CH()
	{
		System.out.println("City Highway");
	}
}
public class Village extends City
{
	void VH()
	{
		System.out.println("Village Highway");
	}
	public static void main(String[] args) 
	{
		Village v=new Village();
		v.VH();
		v.CH();
		v.SH();
		v.NH();
		v.IH();
	}

}
