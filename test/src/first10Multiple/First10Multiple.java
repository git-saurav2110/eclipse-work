package first10Multiple;
import java.util.Scanner;

public class First10Multiple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		for(i=1;i<11;i++)
		{
			System.out.println(n*i);
		}

	}

}
