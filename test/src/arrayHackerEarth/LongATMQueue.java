package arrayHackerEarth;
import java.util.Scanner;

public class LongATMQueue {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];int count =1;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			if(a[i+1]<a[i]) count ++;
		}
		System.out.println(count);
	}

}
