package Array;

public class pairWithAGivenSum {

	public static void main(String[] args) {
		int[] arr= {11,15,6,8,9,10};
		int sum=13;
		
		System.out.println(pairWithSum(arr,arr.length,sum));
	}
	
	static boolean pairWithSum(int[] arr,int n,int key) {
		int i;
		for( i=0;i<n;i++) {
			if(arr[i]>arr[i+1]) break;
		}
		int l=i+1;
		int r=i;
		while(arr[l]+arr[r]!=key) {
			if(arr[l]+arr[r]>key) {
				r=r-1;
				if(r<0) r=arr.length-1;
			}
			else if(arr[l]+arr[r]<key) {
				l=l+1;
				if(l==arr.length) l=0;
			}
			if(l==r) return false;
			
		}
		return true;
	}
}
