package lcsProblem;

public class PrintingLongestCommonSubsequence {

	static String lcs(char[]a ,char[] b,int m,int n) {
		int [][] dp=new int [m+1][n+1];
		for(int i=1;i<m+1;i++) {
			for(int j=1;j<n+1;j++) {
				if(a[i-1]==b[j-1]) {
					dp[i][j]=1+dp[i-1][j-1];
				}
				else 
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		System.out.println("length of shortest supersequence : " + (m+n-dp[m][n]));
		int i=m,j=n; String result="";
		while(dp[i][j]!=0) {
			if(a[i-1]==b[j-1]) {
				result=a[i-1]+result;
				i--;j--;
			}
			else {
				if(dp[i-1][j]> dp[i][j-1]) {
					i--;
				}
				else j--;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String s1="acbcf";
		String s2="abcdaf";
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		System.out.println(lcs(a,b,a.length,b.length));
	}
}
