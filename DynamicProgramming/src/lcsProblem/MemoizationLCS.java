package lcsProblem;
import java.util.*;
public class MemoizationLCS {
	static int [][] dp=new int [1001][1001];
	
	static int lcs(String x, String y,int m,int n) {
		if(n==0 || m==0) return 0;
		if(dp[m][n]!=-1) return dp[m][n];
		if(x.charAt(m-1)==y.charAt(n-1)) {
			return dp[m][n]=1+lcs(x,y,m-1,n-1);
		}
		else {
			return dp[m][n]=Math.max(lcs(x,y,m-1,n),lcs(x,y,m,n-1));
		}
	}
	
	public static void main(String [] args) {
		String x="abcdegh";
		String y="abcefhr";
		for(int [] arr: dp)
		{
			Arrays.fill(arr, -1);
		}
		
		System.out.println(lcs(x,y,x.length(),y.length()));
		
		
	}

}
