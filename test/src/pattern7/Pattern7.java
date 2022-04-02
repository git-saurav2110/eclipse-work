package pattern7;
import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,k=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(j+i>n)
				{
					System.out.print("*" + "  ");
					k++;
				}
				System.out.print("  ");
			}
			System.out.println();
		}
		sc.close();

	}

}
