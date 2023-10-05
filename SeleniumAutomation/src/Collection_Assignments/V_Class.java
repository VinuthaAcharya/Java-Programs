package Collection_Assignments;
//Vector
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class V_Class 
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		v1.add("Ram");
		v1.add(51);
		v1.add('M');
		v1.add(5.0);
		v1.add("Ram");
		v1.add(null);
		System.out.println(v1);
		Vector v2=new Vector();
		v2.add(45);
		v2.add(89);
		v2.add(15);
		v2.add(985);
		Collections.sort(v2);
		System.out.println(v2);
	}

}
