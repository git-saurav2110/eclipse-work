package PriorityQueue;
import java.util.*;

public class KlargestElement {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T--!=0) {
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[] =new int [n];
		PriorityQueue<Integer> pQueue=new PriorityQueue<Integer>();
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++) {
			if(i<k) {
				pQueue.add(a[i]);
			}
			else {
				if(pQueue.peek()<a[i]) {
					pQueue.poll();
					pQueue.add(a[i]);
					
				}
			}
		}
		ArrayList<Integer> ans=new ArrayList<>(pQueue);
		Collections.sort(ans ,Collections.reverseOrder());
		for(int x: ans) {
			System.out.print(x+" ");
		}
	}
	}

}
