import java.util.*;

public class SlidingWindowProblem {
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int T=sc.nextInt();
	   while(T--!=0) {
		   int windowSum=0,currentSum,max = 0;
		   int n=sc.nextInt();
		   int k=sc.nextInt();
		   int arr[]=new int[n];
		   for(int i=0;i<n;i++) {
			   arr[i]=sc.nextInt();
			   }
		   for(int i=0;i<n;i++) {
			   if(i<k) {
			       windowSum+=arr[i];
			       max=windowSum;
			   }
			   else {
				   currentSum=windowSum-arr[i-k]+arr[i];
				   if(currentSum>max) {
					   max=currentSum;
				   }
				   windowSum=currentSum;
			   }
			   
		   }
		   System.out.print(max);
		   
	   }
	

     }
}
