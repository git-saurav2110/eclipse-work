package spojProblems;
import java.util.Scanner;

public class NextPalindrome {
	public boolean check(String str) {
		int i=0;
		for(i=0;i*2<str.length();i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				return false;
			}
				
			
		}
		return true;
	}
	public static void main(String [] args) {
		NextPalindrome np=new NextPalindrome();
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++) {
		int num=sc.nextInt();
		String str=String.valueOf(num);
		while(!np.check(str)) {
			num=num+1;
			str=String.valueOf(num);
			
			
		}
		System.out.print(num);
	}
	}

}
