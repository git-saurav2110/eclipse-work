package array;

public class LeftRotation {
	public static void main(String [] args) {
		int [] a= {1,2,3,4,5};
		int d=2;
		leftRot(a,d);
	}
	static void leftRot(int [] a,int d) {
		 int n=a.length;
	        d=d%n;
	        int [] arr=new int [n];
	            for(int i=0;i<n;i++){
	                if(i<n-d){
	                    arr[i]=a[i+d];
	                }
	                else if(i>=n-d){
	                    arr[i]=a[i+d-n];
	                }
	            }
	        
	        for(int i=0;i<n;i++){
	            System.out.print(arr[i]+" ");
	        }
	       


	    }
	}


