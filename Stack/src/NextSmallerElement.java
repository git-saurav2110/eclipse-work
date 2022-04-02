import java.util.*;
public class NextSmallerElement {
	static void nextSmallerElement(int [] arr) {
		int l=arr.length;
		Stack<Integer> stack=new Stack<Integer>();
		int[] s=new int[l];
		for(int i=l-1;i>=0;i--) {
			while(!stack.isEmpty() && arr[i]<=arr[stack.peek()]) {
				stack.pop();
			}
			if(!stack.isEmpty()) {
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
			else {
				System.out.print(arr[s[i]]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {11,18,3,14,12,5,99,7,21};
		nextSmallerElement(arr);
	}

}
