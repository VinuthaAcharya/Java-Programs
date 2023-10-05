package Collection_Assignments;
//PriorityQueue
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Priority_Queue_Class {

	public static void main(String[] args) 
	{
		PriorityQueue p1=new PriorityQueue();
		p1.add("Ram");
		//p1.add(51);
		//p1.add('M');
		//p1.add(5.0);
		p1.add("Ram");
		//p1.add(null);
		System.out.println(p1);
		PriorityQueue p2=new PriorityQueue();
		p2.add(45);
		p2.add(89);
		p2.add(15);
		p2.add(985);
		Collections.sort((List<T>) p2);
		System.out.println(p2);
	}

}
