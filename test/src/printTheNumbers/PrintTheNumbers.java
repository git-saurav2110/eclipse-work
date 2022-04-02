package printTheNumbers;
import java.util.Scanner;

public class PrintTheNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		
		for(i=0;i<n;i++)
		{
			j=sc.nextInt();
			System.out.print(j +" ");
		}
		

	}

}
