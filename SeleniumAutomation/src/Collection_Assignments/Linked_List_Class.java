package Collection_Assignments;
//LinkedList
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Linked_List_Class {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add("Ram");
		l1.add(51);
		l1.add('M');
		l1.add(5.0);
		l1.add("Ram");
		l1.add(null);
		System.out.println(l1);
		LinkedList l2=new LinkedList();
		l2.add(45);
		l2.add(89);
		l2.add(15);
		l2.add(985);
		Collections.sort(l2);
		System.out.println(l2);
	}

}
