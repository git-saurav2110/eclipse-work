package doWhile;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;int r,j=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			j=(j)*10+r;
			//System.out.println(j+"  " + r +"  "+n);
		}
		if(j==temp)
			System.out.print(j +"  number is palindrome");
		else
			System.out.println("not a palindrome number");
	}

}
