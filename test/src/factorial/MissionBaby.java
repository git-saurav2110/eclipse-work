package factorial;
import java.util.Scanner;
public class MissionBaby {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int z=sc.nextInt();int fact=1,sum=0,rem,j=0;
		for(int i=1;i<=n;i++)
			fact*=i;
	
		
		 while(fact!=0) { rem=fact%10; fact/=10; sum+=rem; j++; } fact=sum;
		 
		 while(sum>=10)
		{
			while(fact!=0)
			{
				rem=fact%10;
			    fact/=10;
			    sum+=rem;
			}
			
	}
		System.out.println(sum+j);

	}

}
