import java.util.*;
class Monk{
    static void solve(double[] arr) {
    	int l=arr.length;
    	int[] x=new int[l];
    	int[] y=new int[l];
    	Stack <Integer> stack=new Stack<Integer>();
    	for(int i=l-1;i>=0;i--) {
    		while(!stack.isEmpty() && arr[i]> arr[stack.peek()]) {
    			stack.pop();
    		}
    		if(!stack.isEmpty())
    			y[i]=stack.peek()+1;
    		else {
    			y[i]=-1;
    		}
    		stack.push(i);
    	}
    	stack.clear();
    	
    	for(int i=0;i<l;i++) {
    		
    		while(!stack.isEmpty() && arr[i]>arr[stack.peek()]) {
    			stack.pop();
    		}
    		if(!stack.isEmpty())
    			x[i]=stack.peek()+1;
    		else {
    			x[i]=-1;
    		}
    		stack.push(i);
    	}
    	for(int i=0;i<l;i++) {
    		System.out.print(x[i]+y[i]);
			System.out.print(" ");
    	}
    	
    	
    }
    public static void main(String[] ars){
        Scanner sc=new Scanner(System.in);
          int k=sc.nextInt();
        double[] arr=new double[k];
        for(int i=0;i<k;i++){
             arr[i]=sc.nextDouble();
        }
        solve (arr);

    }
}