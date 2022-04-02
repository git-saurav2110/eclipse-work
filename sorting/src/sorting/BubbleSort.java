package sorting;

import java.util.Scanner;

public class BubbleSort {
	static  int[] arr=null;
	static void bubbleSort(int [] arr) {
		boolean b=false;
		for(int i=0;i<arr.length;i++) {
			b=false;
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					b=true;
				}
				if(b=false )
					return;
			}
		}
	}

	public static void main(String [] args) {
	
		Scanner sc=new Scanner(System.in);
	     int T=sc.nextInt();
		arr=new int [T];
		for(int i=0;i<T;i++) {
			arr[i]=sc.nextInt();
		}
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
