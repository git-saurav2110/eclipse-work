package countTheNumberBetweenTwoNumber;
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int j=sc.nextInt();
		int k=sc.nextInt();
		int a=0;
		if(l%k==0)
			a++;
		l=l+k-(l%k);
		while(l<=j)
		{
			l+=k;
			a++;
		}
		System.out.println(a);

	}
	

}
