package knapScak;
import java.util.*;
public class CountOfSubsetWithGivenDifference {

	static int count(int arr[],int w) {
		int n=arr.length;
		int [][] dp =new int [n+1][w+1];
		for(int i=0;i<w+1;i++) {
			dp[0][i]=0;
		}
		for(int j=0;j<n+1;j++) {
			dp[j][0]=1;
		}
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<w+1;j++) {
				if(arr[i-1]<=j)
					dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
				else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		
		return dp[n][w];
	}
	public static void main(String[] args) {
		int []arr= {1,7,5,3};
		int diff=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		if(sum%2!=0) sum=sum+1;
		int s1= (sum+diff)/2;
		System.out.println(count(arr,s1));
	}
}
