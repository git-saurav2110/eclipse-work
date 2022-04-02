package doWhile;
import java.util.Scanner;

public class DoWhileCondition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int sum=0,j;
		while(n!=0)
		{
			j=n%10;
			n/=10;
			sum+=j;
		}
		System.out.print(sum);

	sc.close();
	}
}
