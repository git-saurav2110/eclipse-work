import java.util.*;
public class NGE {
	 static void nge(int[] arr) {
		 int l=arr.length;
		 int[] s=new int[l];
		 Stack<Integer> stack=new Stack<Integer>();
		 for(int i=l-1;i>=0;i--) {
			
			 while(!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
				 stack.pop();
			 }
			 if(!stack.isEmpty() ) {
				 s[i]=stack.peek();
			 }			 
			 else
				 s[i]=-1;	
			 
			 stack.push(i);
		 }
		 for(int i=0;i<l;i++) {
			 if(s[i]==-1) {
				 System.out.print("-1 ");
			 }
			 else
				 System.out.print(arr[s[i]]+" ");
		 }
		
	 }
       public static void main(String[] args) {
    	   int [] arr= {18,12,25,27,31,24,16};
    	   nge(arr);
    	   
       }
}
