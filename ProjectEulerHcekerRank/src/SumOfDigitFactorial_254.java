import java.util.*;
public class SumOfDigitFactorial_254 {

	public static final Scanner sc=new Scanner(System.in);
	
	static int fact(int n) {
		if(n<=0) return 1;
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		
	   String s=sc.next(); int m=sc.nextInt();
	   int fn=0;
	   for(int i=0;i<s.length();i++) {
	   fn+=fact(Integer.valueOf(s.charAt(i)+""));
	   }
	   System.out.println(fn);
	   String sf=String.valueOf(fn);
	   int sfn=0;
	   for(int i=0;i<sf.length();i++) {
		   sfn+=Integer.valueOf(sf.charAt(i)+"");
	   }
	   System.out.println(sfn);

	}

}
