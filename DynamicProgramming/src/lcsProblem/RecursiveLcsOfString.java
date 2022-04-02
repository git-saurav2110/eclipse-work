package lcsProblem;
import java.util.*;
public class RecursiveLcsOfString {
	static int lcs(String x,int n,String y,int m) {
		if(n==0|| m==0) return 0;
		if(x.charAt(n-1)==y.charAt(m-1))
			return 1+lcs(x,n-1,y,m-1);
		else {
			return Math.max(lcs(x,n,y,m-1),lcs(x,n-1,y,m));
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		String y=sc.next();
		System.out.println("LCS :"+ lcs(x,x.length(),y,y.length()));
	}

}
