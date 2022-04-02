package minimumBallonCost;
import java.util.Scanner;

public class MinimumBallonCost {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int CGB,CPB,n,i,j=0,s,e,cost;
		n=sc.nextInt();
		//CGB=sc.nextInt();
		//CPB=sc.nextInt();
		//int N=sc.nextInt();
		s=e=0;
		for(j=0;j<n;j++)
		{
			s=e=0;
			CGB=sc.nextInt();
			CPB=sc.nextInt();
			int N=sc.nextInt();
		  for(i=0;i<N;i++)
		  {
			int a=sc.nextInt();
			int b=sc.nextInt();
			s+=a;
			e+=b;
			
		  }
		  if(CGB>CPB )
			{
			if(s>e)
			cost=s*CPB+e*CGB;
		   else
            cost=e*CPB+s*CGB;
			}
	    	else
	    	{
			if(s>e)
				cost=e*CPB+s*CGB;
			else

				cost=s*CPB+e*CGB;
		    }
		  System.out.println(cost);
		}
		
		

 

	}

}
