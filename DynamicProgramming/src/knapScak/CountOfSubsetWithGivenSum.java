package knapScak;

public class CountOfSubsetWithGivenSum {
	static int count(int[] arr,int w,int n) {
		int [][] dp=new int [n+1][w+1];
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<w+1;j++) {
				if(i==0)dp[i][j]=0;
			
			 if(j==0) dp[i][j]=1;
			}
		}
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<w+1;j++) {
				 System.out.print(dp[i][j]+" ");
				
			}System.out.println();
		}	
		System.out.println("------------");
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<w+1;j++) {
				if(arr[i-1]<=j) {
					dp[i][j]=dp[i-1][j-arr[i-1]]+dp[i-1][j];
				}
				else {
					dp[i][j]= dp[i-1][j];
				}
			}
		}
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<w+1;j++) {
				 System.out.print(dp[i][j]+" ");
				
			}System.out.println();
		}	
		
		
		return dp[n][w];
	}
	public static void main(String[] args) {
		int[] arr= {2,3,5,6,8,10};
		int sum=10;
		System.out.println(count(arr,sum,arr.length));
	}
	
}
