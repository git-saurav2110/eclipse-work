package pattern11;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i+j>=n)
					{
					System.out.print("* ");
					System.out.print(" ");
					}
				System.out.print("   ");
				
			}System.out.println();
		}

	}

}
