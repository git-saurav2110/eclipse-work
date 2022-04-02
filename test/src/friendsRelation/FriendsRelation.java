package friendsRelation;
import java.util.Scanner;

public class FriendsRelation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int n;
		int i,j,k;
		for(k=1;k<=T;k++)
		{
			n=sc.nextInt();
			for(i=1;i<=n;i++)
			 {
				for(j=1;j<=2*n;j++)
			 
			{
				if(j<=i || j+i>2*n)
				    System.out.print("*");
				else 
					System.out.print("#");
				
				
				
			}
				
			System.out.println();
			//if(i>n) break;
			 }
			
			System.out.println();
		
		}
	}

}
