package lcsProblem;
import java.util.Scanner;
public class LongestCommonSubstring {

	static int lcs(char[] ch1,char[] ch2,int m,int n) {
		int [][] dp=new int[m+1][n+1];
		int len=0;int row = 0,col = 0;
		
		for(int i=1;i<m+1;i++) {
			for(int j=1;j<n+1;j++) {
				if(ch1[i-1]==ch2[j-1]) {
					dp[i][j]=1+dp[i-1][j-1];
					if(len<dp[i][j]) {
						len=dp[i][j];
						row=i;
						col=j;
					}
				}
				else 
					dp[i][j]=0;
			}
		}
		String result="";
		while(dp[row][col]!=0) {
			result=ch1[row-1]+result;
			row--;
			col--;
		}
		System.out.println(result+" ");
		System.out.println("-----------------------");
		
		return len;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s1="ramji";
		String s2="ram";
		char[] ch1=s1.toCharArray();
		char[]ch2=s2.toCharArray();
		System.out.println(lcs(ch1,ch2,ch1.length,ch2.length));
	}
}
