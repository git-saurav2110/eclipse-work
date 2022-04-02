package lcsProblem;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LongestRepeatingSequence {
	
	public static void main(String[] args) {
		String s="AABEBCDD";
		StringBuffer sb=new StringBuffer(s);
		String s2=sb.reverse().toString();
		
		int n= s.length();
		
		int[][] dp=new int [n+1][n+1];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(s.charAt(i-1)==s2.charAt(j-1) && i!=j) {
					dp[i][j]=dp[i-1][j-1]+1;
				}else {
					dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		System.out.println(dp[n][n]);
	}

}
