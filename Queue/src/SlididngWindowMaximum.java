 /*  it will print maximum of all subArray  */



import java.util.*;
public class SlididngWindowMaximum {
        public static void main(String[] args) {
        	int [] a= {11,12,44,2,0,88,99,-1};
        	int k=3;
        	getMaximumNo(a,a.length,k);
        }
        static void getMaximumNo(int[] a,int n,int k) {
        	Deque<Integer> Qi=new LinkedList<Integer>();
        	int i;
        	for(i=0;i<k;i++) {
        		while(!Qi.isEmpty() && a[Qi.peekLast()]<=a[i] )
        			Qi.removeLast();
        		Qi.addLast(i);
        	}
        	for(;i<n;i++) {
        		System.out.println(a[Qi.peek()]+" ");
        		
        		while(!Qi.isEmpty() && Qi.peekLast()<=i-k)
        			Qi.removeFirst();
        		
        		while(!Qi.isEmpty() && a[Qi.peekLast()]<=a[i])
        			Qi.removeLast();
        		Qi.addLast(i);
        	}
        	System.out.println(a[Qi.peek()]);
        }
}
