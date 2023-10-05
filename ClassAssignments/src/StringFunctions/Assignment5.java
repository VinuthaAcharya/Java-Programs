package StringFunctions;
/*"String Functions:

Input 1 : MANISH
Input 2 : Abhishek
Output : MAAbNiISshHek
"*/
public class Assignment5 
{

	public static void main(String[] args) 
	{
		String i1="MANISH";
		String i2="Abhishek";
		System.out.println("First input is----"+i1);
		System.out.println("Second input is----"+i2);
		String o1=i1.substring(0, 1);//M
		String o2=i2.substring(0, 1);//A
		
		String o3=i1.substring(1, 2);//A
		String o4=i2.substring(1, 2);//b
		
		String o5=i1.substring(2, 3);//N
		
		
		String o6=i2.substring(2, 3);//h
		
		String o7=i1.substring(3, 4);//I
		String o8=i2.substring(3, 4);//i
		
		String o9=i1.substring(4, 5);//S
		String o10=i2.substring(4, 5);//s
		
		String o11=i1.substring(5, 6);//H
		String o12=i2.substring(5, 6);//h
		
		String o13=i2.substring(6, 7);//e
		String o14=i2.substring(7, 8);//k
		System.out.print("Output is----");
		System.out.println(o1+o2+o3+o4+o5+o8+o7+o9+o10+o6+o11+o13+o14);
	}

}
