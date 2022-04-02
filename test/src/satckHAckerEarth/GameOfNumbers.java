package satckHAckerEarth;
import java.util.*;
import java.util.Stack;

public class GameOfNumbers {
	static Scanner sc=new Scanner(System.in);
	public static void nextGreater(int[] arr,int [] next,char order) {
		Stack<Integer> stack=new Stack<>();
		for(int i=arr.length-1;i>=0;i--) {
			while(!stack.isEmpty() && ((order=='G')?arr[stack.peek()]<=arr[i] : arr[stack.peek()]>=arr[i]))
			{
				stack.pop();
			}
			if(!stack.isEmpty()) {
				next[i]=stack.peek();
			}
			else
				next[i]=-1;
			
			stack.push(i);
		}
		
	}
	
	
	public static void output(int[] arr) {
		int[] NG=new int[arr.length];
		int[] RS=new int[arr.length];
		
		nextGreater(arr,NG,'G');
		nextGreater(arr,RS,'S');
		
		for(int i=0;i<arr.length;i++)
		{
			if(NG[i]!=-1 && RS[NG[i]]!=-1)
				System.out.print(arr[RS[NG[i]]]+" ");
			else
				System.out.print("-1 ");
				
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		int N=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		output(arr);
		
	}

}
