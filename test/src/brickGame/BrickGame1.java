package brickGame;
import java.util.Scanner;

public class BrickGame1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1,j,k=0;
		while(n>=0)
		{
			k=n-i;
			j=k-2*i;
			n=j;
			i++;
			
		}
		if(k<=0)
			System.out.print("Motu");
		else
			System.out.print("Patlu");

	}

}
