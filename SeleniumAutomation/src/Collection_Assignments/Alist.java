package Collection_Assignments;
//ArrayList
import java.util.ArrayList;
import java.util.Collections;

public class Alist {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Ram");
		a1.add(51);
		a1.add('M');
		a1.add(5.0);
		a1.add("Ram");
		a1.add(null);
		System.out.println(a1);
		ArrayList b1=new ArrayList();
		b1.add(45);
		b1.add(89);
		b1.add(15);
		b1.add(985);
		Collections.sort(b1);
		System.out.println(b1);
	}

}
