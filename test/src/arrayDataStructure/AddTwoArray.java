package arrayDataStructure;
import java.util.Scanner;

public class AddTwoArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int[] a,b,c;
		a=new int[n];b=new int[n];
		for (int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for (int i=0;i<n;i++)
			b[i]=sc.nextInt();
		c=new int[n];
		for (int i=0;i<n;i++)
			{
			c[i]=a[i]+b[i];
			}
	for(int k:c)
		System.out.print(k +" ");
	}

}
