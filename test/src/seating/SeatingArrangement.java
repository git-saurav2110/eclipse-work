package seating;
import java.util.Scanner;

public class SeatingArrangement {

	public static void main(String[] args) {
		// First line of input will consist of
		//a single integer T denoting number of test-cases.
		//Each test-case consists of a single integer N denoting the seat-number.
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		for(int j=0;j<i;j++)
		{
			int T=sc.nextInt();
		int s, a;
		 s=(T % 12);
		
	
		 if(T % 12 == 0)
		{
			
			s=T-11;
			System.out.println(s + " WS");
		}
		else if(T%12 !=0)
		{  
			 s=(T % 12);
			a=T / 12;
			a+=1;
			//System.out.print(s+" 22");
			System.out.print((12*a)-s+1);
			
		
		
		if(T%6==0 ||T%6==1)
			System.out.println(" WS");
		else if(T%6 ==2 ||T%6==5)
			System.out.println(" MS");
		else if(T%6==3 || T%6==4)
			System.out.println(" AS");
		}
		}
          // System.out.print("\n");
		sc.close();
		}
	
}
