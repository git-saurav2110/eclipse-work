package dataStructure;

import java.util.Scanner;

public class SelectionSorts {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int[] a= {11,22,9,0,-1};
		int i=0,small,temp;
		for(i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					small=a[i];
					a[i]=a[j];
					a[j]=small;
			
					
				}
			}
		}
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
				;

	}

}
