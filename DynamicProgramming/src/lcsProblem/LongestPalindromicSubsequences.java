package lcsProblem;

public class LongestPalindromicSubsequences {

	static int lps(char[]a, char[] b,int m,int n) {
		int[][] dp=new int [m+1][n+1];
		for(int i=1;i<m+1;i++) {
			for(int j=1;j<n+1;j++) {
				if(a[i-1]== b[j-1] ){
					dp[i][j]=1+dp[i-1][j-1];
				}
				else
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		return dp[m][n];
	}
	
	public static void main(String[] args) {
		String s1="ramayan";
		String s2="";
		for(int i=0;i<s1.length();i++) {
			s2+=s1.charAt(s1.length()-1-i);
		}
		System.out.println(s2);
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		System.out.println(lps(a,b,a.length,b.length));
	}
}
