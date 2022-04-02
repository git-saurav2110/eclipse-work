package PriorityQueue;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(1);
		pq.add(141);
		pq.add(124);
		pq.add(145);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println("------------------------");
		PriorityQueue<Integer> pq1=new PriorityQueue<>();
		pq1.add(12);
		pq1.add(20);
		pq1.add(100);
		pq1.add(1);
		pq1.add(-2);
		System.out.println(pq1);
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
		
	}

}
