package knapScak;
import java.util.*;
public class EqualSumPartition {
	static boolean equalSum(int [] arr,int w,int n) {
		boolean [][] dp=new boolean[n+1][w+1];
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<w+1;j++) {
				if(i==0) dp[i][j]=false;
				if(j==0) dp[i][j]=true;
			}
		}
		
		// printing initial dp array
		
				for(int i=0;i<n+1;i++) {
					for(int j=0;j<w+1;j++) {
						 System.out.print(dp[i][j]+" ");
						
					}System.out.println();
				}
				
				System.out.println("------------------------------");
				
				
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<w+1;j++) {
				if(arr[i-1]<= j) {
					
					dp[i][j]=(dp[i-1][j-arr[i-1]] || dp[i-1][j]);
				}
				else
					dp[i][j]=dp[i-1][j];
				
				
			}
		}
		List<Integer> set1=new ArrayList<Integer>();
		List<Integer> set2=new ArrayList<Integer>();
		int i=n;
		int curr_sum=w;
		if(!dp[n][w]) {
			System.out.println("-1 \n");
		}
		while(i>0 && curr_sum >=0) {
			if(dp[i-1][curr_sum]) {
				i--;
				set2.add(arr[i]);
				
			}
			else if(dp[i-1][curr_sum-arr[i-1]]) {
				i--;
				curr_sum-=arr[i];
				set1.add(arr[i]);
			}
		}
		System.out.println("set : "+set1 +" set 2: "+set2);
		for( i=0;i<n+1;i++) {
			for(int j=0;j<w+1;j++) {
				 System.out.print(dp[i][j]+" ");
				
			}System.out.println();
		}		
		return dp[n][w] ;
}
	
	public static void main(String[] args) {
		int [] arr= {2,3,5,8,6,10};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum%2);
		
		if(sum%2!=0) System.out.println("not be partitioned "
				+ "into two equal part");
		else {
			System.out.print(equalSum(arr,sum/2,arr.length));
		}
	}

}
