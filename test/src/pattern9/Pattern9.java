package pattern9;
import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		System.out.println("*  ");
		for(i=1;i<n-1;i++)
			{
			for(j=1;j<i+2;j++)
				{
				if(j==1 || j==i+1)
					System.out.print("*");
				     System.out.print("  ");
				     if(j==i+1)
				    	 System.out.println();
				}
		
			}
		
		for(i=1;i<=n;i++)
			System.out.print("* ");
		
				
	}
}
