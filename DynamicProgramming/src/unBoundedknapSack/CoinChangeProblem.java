package unBoundedknapSack;

public class CoinChangeProblem {

	static int ways(int [] coin,int n,int w) {
		int [][] dp=new int [n+1][w+1];
		
		for(int i=0;i<w+1;i++) {
			dp[0][i]=0;
		}
		for(int i=0;i<n+1;i++) {
			dp[i][0]=1;
		}
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<w+1;j++) {
				if(coin[i-1]<=j)
				dp[i][j]=dp[i-1][j] + dp[i][j-coin[i-1]];
				else
					dp[i][j]=dp[i-1][j];
			}
		}
		return dp[n][w];
		
	}
	public static void main(String[] args) {
		int [] coin= {1,2,3};
		int sum=5;
		System.out.println(ways(coin,coin.length,sum));
	}
}
