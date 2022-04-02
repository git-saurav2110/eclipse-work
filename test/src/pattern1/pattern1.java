package pattern1;
import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int j=0,i=0;
		for(i=0;i<a;i++)
		{
			for(j=0;j<=i;j++)
				System.out.print("* ");
		
		System.out.println();
		}
		sc.close();

	}

}
