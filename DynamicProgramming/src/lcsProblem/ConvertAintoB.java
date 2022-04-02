package lcsProblem;

public class ConvertAintoB {

	static int lcs(char[]a,char[] b,int m,int n) {
		int[][] dp=new int[m+1][n+1];
		for(int i=1;i<m+1;i++) {
			for(int j=1;j<n+1;j++) {
				if(a[i-1]==b[j-1])
					dp[i][j]=1+dp[i-1][j-1];
				else
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		return dp[m][n];
	}
	public static void main(String [] args) {
		String s1="heap"
				,s2="pea";
		char[] a=s1.toCharArray();
		char[] b= s2.toCharArray();
		System.out.println("Deletion :" +(a.length-lcs(a,b,a.length,b.length)) +"\nInsertion : " +
		(b.length-lcs(a,b,a.length,b.length)));
	}
}
