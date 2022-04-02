package pattern2;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int j=0,i=0;
		for(i=0;i<a;i++)
		{
			for(j=0;j+i<(a);j++)
				System.out.print("* ");
		
		System.out.println();
		}
		sc.close();
	}

}
