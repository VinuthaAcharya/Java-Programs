package Collection_Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//LinkedHashSet
public class L_HSet {

	public static void main(String[] args) {
		LinkedHashSet h1=new LinkedHashSet();
		h1.add("Ram");
		h1.add(51);
		h1.add('M');
		h1.add(5.0);
		h1.add(null);
		h1.add(null);//Does not allows 2nd Null
		h1.add("Ram");//Duplicate not allows
		System.out.println(h1);
		LinkedHashSet<Integer> h2=new LinkedHashSet<>();
		h2.add(45);
		h2.add(89);
		h2.add(15);
		h2.add(985);
		TreeSet<Integer> tree_set = new TreeSet<>(h2);
		//Collections.sort(array);//Sorting not possible
		System.out.println(h2);	
	}

}
