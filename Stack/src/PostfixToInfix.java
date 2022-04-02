import java.util.*;
public class PostfixToInfix {
	static String postfixToInfix(String exp) {
		Stack<String> stack=new Stack<String>();
		for(int i=0;i<exp.length();i++) {
			char ch=exp.charAt(i);
			String str="";
			if(Character.isLetterOrDigit(ch)) {
				str+=ch;
				stack.push(str);
			}
			else {
				String op1=stack.pop();
				String op2=stack.pop();
				str=op2+ch+op1;
				stack.push(str);
			}
		}
		return stack.peek();
	}
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      String str=sc.next();
        	System.out.println(postfixToInfix(str));
         
	}
}
