package sorting;
import java.util.Scanner;

public class SelectionSort {

	static int []arr=null;
	static void selectionSort(int [] arr) {
		int min=0;
		for(int i=0;i<arr.length-1;i++) {
			min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		arr=new int [T];
	for(int i=0;i<T;i++) {
		arr[i]=sc.nextInt();
	}
	// System.out.println();
		selectionSort(arr);
		for(int i=0;i<T;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
