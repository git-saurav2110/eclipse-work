
public class MaximizeTheExpression {
	
	static int maxV(int[] arr,int start,int end) {
		int max=Integer.MIN_VALUE;
		for(int i=start;i<=end;i++) {
			
			if(max<arr[start]) max=arr[start];
		}
		return max;
	}
	
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,6,7};
		

		int p=3,q=5,r=9;
		int maximum=Integer.MIN_VALUE;
	    for(int i=1;i<arr.length-1;i++) {
	    	int j=maxV(arr,0,i-1);
	    	int k=maxV(arr,i+1,arr.length-1);
	    	
	    	maximum=Math.max(maximum,p*j+q*arr[i]+r*k);
	    }
	    
	    System.out.print(maximum);
		
	}

}
