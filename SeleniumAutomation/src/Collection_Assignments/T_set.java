package Collection_Assignments;
//TreeSet
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class T_set {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add("Ram");
		//t1.add(51);//Only  homogeneous values
		//t1.add('M');
		//t1.add(5.0);
		//t1.add(null);//Does not allows Null
		t1.add("Ram");//Duplicate not allows
		System.out.println(t1);
		TreeSet t2=new TreeSet();
		t2.add(45);
		t2.add(89);
		t2.add(15);
		t2.add(985);
		//Collections.sort(t2);Sorting not possible
		System.out.println(t2);
	}

}
