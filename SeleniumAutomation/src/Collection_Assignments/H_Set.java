package Collection_Assignments;
import java.util.Collections;
//HashSet
import java.util.HashSet;
import java.util.List;

public class H_Set {

	public static void main(String[] args) 
	{
		HashSet h1=new HashSet();
		h1.add("Ram");
		h1.add(51);
		h1.add('M');
		h1.add(5.0);
		h1.add(null);
		h1.add(null);
		h1.add("Ram");//Duplicate not allows
		System.out.println(h1);
		HashSet h2=new HashSet();
		h2.add(45);
		h2.add(89);
		h2.add(15);
		h2.add(985);
		//Collections.sort((List<T>) h2);//Sorting not possible
		System.out.println(h2);	}

}
