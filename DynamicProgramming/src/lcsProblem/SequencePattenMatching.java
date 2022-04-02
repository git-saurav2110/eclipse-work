package lcsProblem;

public class SequencePattenMatching {
	public static void main(String[] args) {
		String a="ADXYM";
		String b="ADXCPY";
		
		int n=a.length();
		int m= b.length();
		
		int[][] dp=new int [n+1][m+1];
		int count=0;
		int i=0;int j=0;
		while(i<n && j<m) {
			if(a.charAt(i)==b.charAt(j)) {
				i++;j++;
				count++;
			}
			else {
				j++;
			}
		}
		if(count==a.length()) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("NO");
		}
	}
}
