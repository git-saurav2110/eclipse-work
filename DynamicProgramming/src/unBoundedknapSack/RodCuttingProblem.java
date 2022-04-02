package unBoundedknapSack;

public class RodCuttingProblem {
	public static void main(String[] Args) {
		int [] length= {1,2,3,4};
		int [] price= {10,21,4};
		int N=3;
		System.out.println(maxValueRodCutting(length,price,length.length,N));
	}

	private static int maxValueRodCutting(int[] length, int[] price, int w, int n) {
		int[][] dp=new int [n+1][w+1];
		for(int i=0;i<n+1;i++)
			dp[i][0]=0;
		for(int i=-0;i<w+1;i++)
			dp[0][i]=0;
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<w+1;j++) {
				if(length[i-1]<= j) {
					dp[i][j]=Math.max(dp[i-1][j], price[i-1]+dp[i][j-length[i-1]]);
				}
				else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		return dp[n][w];
	}
}
