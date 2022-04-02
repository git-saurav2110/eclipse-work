package pattern5;
import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(j+i>=n+1)
					System.out.print("*");
				else //(i+j<=n)
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
