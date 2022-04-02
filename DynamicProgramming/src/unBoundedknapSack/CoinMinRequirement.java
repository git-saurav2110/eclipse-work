package unBoundedknapSack;

public class CoinMinRequirement {

	
	public static void main(String[] args) {
		int[] coin= {3,1,2};
		int sum=6;
		System.out.println(minCoinRequiremwnt(coin,coin.length,sum));
	}
	private static int minCoinRequiremwnt(int[] coin, int n, int w) {
		int[][] dp=new int [n+1][w+1];
		
		for(int i=0;i<n+1;i++) {
			dp[i][0]=0;
		}
		for(int j=0;j<w+1;j++) {
			dp[0][j]=Integer.MAX_VALUE-1;
		}
		for(int j=1;j<w+1;j++) {
			dp[1][j]=( j % coin[0]==0)? (j /coin[0]) : Integer.MAX_VALUE;
		}
		for(int i=2;i<n+1;i++) {
			for(int j=1;j<w+1;j++) {
				if(coin[i-1]<=j) {
					dp[i][j]=Math.min(dp[i-1][j], 1+dp[i][j-coin[i-1]]);
				}
				else
					dp[i][j]=dp[i-1][j];
			}
		}
		return dp[n][w];
	}
}
