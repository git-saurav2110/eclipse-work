package playWithNumbers;
import java.util.Scanner;

public class PlayWithNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,l,d,r,sum=0,p=0;
		int[] array=new int[n];
		int q=sc.nextInt();
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			System.out.print(array[i]);
		}
		System.out.println();
		 
		for(j=0;j<q;j++)
		{
			l=sc.nextInt();
			r=sc.nextInt();
			d=r-l+1;
			while(l<=r)
			{
				sum+=array[l-1];
				l++;
				
			}
			System.out.println(sum/d);
			
		}
		

	}

}
