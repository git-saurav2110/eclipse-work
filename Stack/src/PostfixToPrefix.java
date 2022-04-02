import java.util.*;
public class PostfixToPrefix {
	static String postfixToPrefix(String exp) {
		Stack<String> stack=new Stack<String>();
		for(int i=0;i<exp.length();i++) {
			String str="";
			char ch=exp.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				str+=ch;
				stack.push(str);
			}
			else {
				String op1=stack.pop();
				String op2=stack.pop();
				str=ch+op2+op1;
				stack.push(str);
			}
		}
		return stack.peek();
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		String str=sc.next();
		System.out.println(postfixToPrefix(str));
	}

}
