package pattern4;
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(j+i<n+2)
					System.out.print("* ");
					
			}
			System.out.println();
		}
		sc.close();

	}

}
