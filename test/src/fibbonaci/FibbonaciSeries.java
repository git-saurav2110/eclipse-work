package fibbonaci;
import java.util.Scanner;

public class FibbonaciSeries {

	public static void main(String[] args) {
		int a=0,b=1,s,i=0;
		Scanner sc= new Scanner (System.in);
		int n= sc.nextInt();
		System.out.print(a +" " +b+" ");
		for(i=0;i<n-2;i++)
		{
			s=a+b;
			a=b;
			b=s;
			System.out.print(s+" ");
		}
		sc.close();
		

	}

}
