package sorting;
import java.util.Scanner;
public class InsertionSort {
	static int[] arr;
	static void insertionSort(int [] arr) {
		int min;
		for(int i=1;i<arr.length;i++) {
			min=arr[i];
			int j=i;
		   while( j>=1 && min<arr[j-1] ) {
			   arr[j]=arr[j-1];
			   --j;
		   }
		   arr[j]=min;
		}
	}
	
	public static void print(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int T=sc.nextInt();
		 arr=new int[T];
		while(T>0) {
			arr[T-1]=sc.nextInt();
			T--;
		}
		
		insertionSort(arr);
		print(arr);
		
	}

	
}
