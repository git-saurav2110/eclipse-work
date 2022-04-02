package knapScak;
import java.util.*;
public class SubsetSumProblem {
	static boolean knapSack(int [] arr,int w,int n ) {
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
				if(arr[i-1]<=j)
				dp[i][j]=(dp[i-1][j-arr[i-1]] || dp[i-1][j]);
				else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		
		List<Integer> set1=new ArrayList<Integer>();
		List<Integer> set2=new ArrayList<Integer>();
		
		
		
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<w+1;j++) {
				 System.out.print(dp[i][j]+" ");
				
			}System.out.println();
		}
		
		return dp[n][w];
	}
	public static void main(String[] args) {
		int [] arr= {2,3,7,8,6};
		int n=arr.length;
		int sum=10;
		System.out.println(knapSack(arr,sum,n));
	}

}
