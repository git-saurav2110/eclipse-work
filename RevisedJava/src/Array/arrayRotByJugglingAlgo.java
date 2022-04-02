package Array;

public class arrayRotByJugglingAlgo {
	public static void main(String [] args) {
		int [] arr= {1,2,3,4,5,6,7,8,9};
		int rot=3;
		int n=arr.length;
		rot=rot%n;
		System.out.println(rot+"--rot--");
		int gcd=GCD(n,rot);
		/* System.out.println(gcd); */
		
		arrRot(arr,rot,gcd);
		for(int i=0;i<n;i++) {
			System.out.print("-----"+arr[i]);
		}
	}
	
	static void arrRot(int[] arr,int rot,int d )
	{
		for(int i=0;i<rot;i++) {
			int k=i;
			int temp=arr[k];
			while(k+d<arr.length) {
				arr[k]=arr[k+d];
				System.out.println(arr[k]);
				k+=d;
				
			}
			arr[k]=temp;
		}
	}
	static int GCD(int n, int rot) {
		if(n%rot ==0) return rot;
		
		int temp=rot;
		rot=n%rot;
		n=temp;
		GCD(n,rot);
		
		return 0;
		
	}

}
