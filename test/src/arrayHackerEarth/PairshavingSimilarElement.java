package arrayHackerEarth;
import java.util.*;

public class PairshavingSimilarElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int temp;
		int[] arr=new int[n];
		
		for( int k=0;k<n;k++)
		{
			arr[k]=sc.nextInt();
		}
		for(int t: arr)
			System.out.println("  "+ t);
		for(int j=0;j<=n;j++)
		{
			for(int i=1;i<n;i++) 
			{   
				if(arr[j]>arr[i])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				else continue;
			}
		}
		for(int t: arr)
			System.out.println("  "+ t);
	}

}
