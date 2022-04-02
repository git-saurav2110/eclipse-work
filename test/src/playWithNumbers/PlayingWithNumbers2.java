package playWithNumbers;

import java.util.Scanner;

public class PlayingWithNumbers2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,l,d,r,Sum=0;
		int[] array=new int[n];
		int[] sum=new int[n];
		int q=sc.nextInt();
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			// System.out.print(array[i]);
			Sum+=array[i];
			sum[i]=Sum;
			System.out.print(sum[i]);
			
		}
		System.out.println();
		 
		/*for(j=0;j<q;j++)
		{
			l=sc.nextInt();
			r=sc.nextInt();
			d=(sum[r-1]-sum[l-1])/(r-l+1);
			System.out.println(d);
			
			
		}*/
		

	}

}
