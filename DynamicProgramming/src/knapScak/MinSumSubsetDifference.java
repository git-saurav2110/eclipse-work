package knapScak;

import java.util.ArrayList;

import java.util.List;

public class MinSumSubsetDifference {

	static int subsetdiff(int[] arr,int w,int n) {
		boolean dp[][]=new boolean [n+1][w+1];
		for(int i=0;i<w+1;i++) {
			dp[0][i]=false;
		}
		for(int i=0;i<n+1;i++) {
			dp[i][0]=true;
		}
		
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<w+1;j++) {
				if(arr[i-1]<=j) {
					dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
				}
				else
					dp[i][j] = dp[i-1][j];
			}
		}
		int lastTrueW=0;
		for(int i=w;i>=0;i--) {
			if(dp[n][i]) {
				lastTrueW=i;
				break;
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
		
		return lastTrueW;
	}
	public static void main(String[] args) {
		int [] arr= {1,3,7,5,11};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int result= sum - (2 * subsetdiff(arr,sum/2,arr.length));
		System.out.println("min diff is : " + result);

	}

}
