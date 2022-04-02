import java.util.*;
public class SquareOfSortedArray {
	public static void main(String [] args) {
		int [] a= {-9,-6,-2,1,5,8,9};
		int [] result=new int[a.length];
		int start=0;int last=a.length-1;
		for(int i=a.length-1;i>=0;i--) {
			if(Math.abs(a[start])>=Math.abs(a[last])) {
				result[i]=a[start]*a[start];
				start++;
				
			}
			else if(Math.abs(a[start])<Math.abs(a[last])) {
				result[i]=a[last]*a[last];
				last--;
			}
			
		}
		for(int j=0;j<a.length;j++) {
			System.out.print(result[j]+" ");
		}
		
		System.out.println("\n-----------------------------------");
		
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]*a[i];
		}
		Arrays.sort(a);
		for(int s: a) {
			System.out.print(s+" ");
		}
	}

}
