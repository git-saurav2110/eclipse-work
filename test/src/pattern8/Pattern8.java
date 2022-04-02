package pattern8;
import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,p=0;
		for(i=1;i<=n;i++)
		{
			if(i<=n/2+1)
			{
			for(j=1;j<=i;j++)
			System.out.print("* ");
			p=i;
			}
			else if(i>n/2+1)
			{
				for(j=1;j <= p-1;j++)
				{
					System.out.print("* ");
				}
				p=p-1;
			}
			System.out.println();
		}
		

	}

}
