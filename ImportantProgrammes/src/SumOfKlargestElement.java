import java.util.PriorityQueue;
import java.util.Scanner;
public class SumOfKlargestElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T--!=0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int [] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				
			}
			PriorityQueue<Integer> pq=new PriorityQueue<>();
			for(int i=0;i<n;i++) {
				if(i<k) {
					pq.add(arr[i]);
				}
				else {
					if(pq.peek()<arr[i]) {
						pq.poll();
						pq.offer(arr[i]);
					}
				}
			}
			int sum=0;
			for(int j=0;j<k;j++) {
				sum+=pq.poll();
			}
			System.out.println(sum);
		}
	}

}
