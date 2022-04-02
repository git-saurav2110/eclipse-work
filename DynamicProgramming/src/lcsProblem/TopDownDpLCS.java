package lcsProblem;

public class TopDownDpLCS {

	static int[][] dp=null;
	public static void main(String [] args) {
		String x="ABCDGH";
		String  y="AEDFHR";
		dp=new int [x.length()+1][y.length()+1];
		
		for(int i=0;i<x.length();i++) {
			for (int j=0;j< y.length();j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nlcs :"+lcs(x,y,x.length(),y.length())+"\n");
		
		for(int i=0;i<x.length();i++) {
			for (int j=0;j< y.length();j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int lcs(String x,String y,int n,int m) {
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<m+1;j++) {
				if(x.charAt(i-1)==y.charAt(j-1))
					dp[i][j]=1+dp[i-1][j-1];
				else 
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			}
		}
		return dp[n][m];
	}
}
