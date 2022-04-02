package factorial;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int i,a=1;
		for(i=1;i<=N;i++)
		{
			//int N=sc.nextInt();
			a*=i;
		}
		
     System.out.println(a);
     sc.close();
	}
	//sc.close();

}
