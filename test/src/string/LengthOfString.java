// find all the marks that are not smaller than those on its right side in the array.
package string;
import java.util.*;

public class LengthOfString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); boolean b=false;
		int [] marks=new int[n];
		for(int i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++)
		{
			b=false;
			for(int j=i+1;j<n;j++)
			{
				if(marks[i]<marks[j]) 
				{	b=false;
					break;
					}
				else
				{
					b=true;
					
				}
			}
			if(b)System.out.print(marks[i]+" ");
		}
		System.out.print(b);
		
		
	}

}
