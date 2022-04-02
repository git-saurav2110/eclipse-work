import java.util.*;
public class StockSpanProb {
	static void stockSpan(int [] day) {
		int length=day.length;
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=length-1;i>=0;i--) {
			int j=i,count=0;
			while(day[j]<=day[i] && j>=0) {
				count++;
				j--;
				if(j==-1)break;
			}
			stack.push(count);
			
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
	}
	public static void main(String [] args) {
		int [] arr= {100,80,60,70,60,75,85};
		stockSpan(arr);
	}

}
