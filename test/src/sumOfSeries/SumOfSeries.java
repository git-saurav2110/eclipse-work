package sumOfSeries;
import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double i,s=0;
		for(i=1;i<=n;i++)
		{
			s+=(1/i);
		}
		System.out.println(s);

	}

}
