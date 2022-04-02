package arrayDataStructure;
import java.util.Scanner;

public class BinaryQueries {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++)
			num[i]=sc.nextInt();
		for(int i=0;i<q;i++)
		{
			int a=sc.nextInt();
			if(a==1) {
				int k=sc.nextInt();
				if(num[k]==1)num[k]=0;
				else
					num[k]+=1;
			}
			else
			{
				int l = sc.nextInt();
				int r=sc.nextInt();
				
				if(num[r-1]==1)System.out.println("ODD");
				else System.out.println("EVEN");
			} 
			
			    
		}

	}

}
