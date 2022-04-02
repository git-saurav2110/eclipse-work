package sumOfSeries2;

import java.util.Scanner;

public class SumOfSeries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double i,s=0;
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			s-=(1/(i));
			else
				s+=1/i;
		}
		System.out.println(s);

	}

}
