import java.util.*;
public class PrefixToPostfix {
	static String prefixToPostfix(String exp) {
		Stack<String> stack=new Stack<String>();
		
		for(int i=exp.length()-1;i>=0;i--) {
			String str="";
			char ch=exp.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				str+=ch;
				stack.push(str);
			}
			else {
				String op1=stack.pop();
				String op2=stack.pop();
			    str=op1+op2+ch+"";
			    stack.push(str);
			}
		}
		return stack.peek();
	}
	public static void main(String[] args) { 
		String str="*-A/BC-/AKL";
		System.out.println(prefixToPostfix(str));
		
	}

}
