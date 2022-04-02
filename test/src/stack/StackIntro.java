package stack;
import java.util.*;

public class StackIntro {
	public static void main(String args[]) {
		Stack<Integer> stack= new Stack<Integer>();
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.remove(2);
		System.out.println(stack);
		stack.add(19);
		stack.add(23);
		stack.push(20);
		stack.add(0,12);
		System.out.println(stack);
		
		
	}

}
