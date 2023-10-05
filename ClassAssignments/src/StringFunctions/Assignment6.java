package StringFunctions;
/*"String Functions:

Input : Manish
Output : MaNiSh"*/
public class Assignment6 
{
	public static void main(String[] args) 
	{
		String i="Manish";
		String n=i.substring(2, 3);
		String nu=n.toUpperCase();
		String s=i.substring(4,5);
		String su=s.toUpperCase();
		String a=i.substring(3, 4);
		String o1=i.substring(0, 2);
		String o2=i.substring(5);
		System.out.println(o1+nu+a+su+o2);
	}

}
