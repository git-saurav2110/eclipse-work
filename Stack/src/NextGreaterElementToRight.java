import java.util.*;
public class NextGreaterElementToRight {
	static void ngeToRight(int [] arr) {
		int l=arr.length;
		
		Stack<Integer> stack=new Stack<Integer>();
		int[] n=new int [l];
		for(int i=l-1;i>=0;i--) {
			while(!stack.isEmpty() && arr[i]>=arr[stack.peek()]) {
				stack.pop();
			}
			if(!stack.isEmpty()) {
				n[i]=stack.peek();
			}
			else
				n[i]=-1;
			stack.push(i);
		}
		for(int i=0;i<l;i++) {
			int j=i;
			while(n[j]!=-1) {
				System.out.print(arr[n[j]]+"-->");
				j=n[j];
			}
			if(n[j]==-1) {
				System.out.print("-1 ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[] arr= {3,4,2,7,5,8,10,6};
		ngeToRight(arr);
	}

}
