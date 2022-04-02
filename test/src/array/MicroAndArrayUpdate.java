package array;
import java.util.Scanner;

public class MicroAndArrayUpdate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();int small;
		for(int i =0;i<T;i++)
		{
		  int n=sc.nextInt();
		  int m=sc.nextInt();
		 int [] k=new int[n];
		 for(int j=0;j<n;j++)
			 k[j]=sc.nextInt();
		 small=k[0];
		 for(int p=0;p<n;p++)
		 {
			 if(k[p]<small)small=k[p];
		 }
		  if(small<m)System.out.println(m-small);
		  else System.out.println("0");
				
		}

	}

}
