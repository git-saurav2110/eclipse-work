package pattern10;
import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;int j=0;int temp;
		for(i=0;i<n;i++)
		{
			
			for(j=1;j<=n+i;j++)
				if(j<=2*i)
				System.out.print("  ");
				else
					System.out.print("* ");
			System.out.println();
		}
		
		
		

	}

}
