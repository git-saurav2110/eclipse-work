package dataStructure;
import java.util.*;

public class SortingSelection {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int[] a= new int[n];
		int j=0,minidx,temp;
		
	    for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<a.length-1;i++)
		{
			minidx=0;
			j=minidx+1;
			boolean sorted=true;
		 while(j<a.length-i)
			{
			 if(a[minidx]>a[j])
			{
				temp=a[minidx];
				a[minidx]=a[j];
				a[j]=temp;
				sorted=false;
			}
			 minidx=j;j++;
			}
			 if(sorted==true)break;
			
			
		}
			for(int item:a)
			System.out.print(item+" ");
			
			sc.close();
	}

}
