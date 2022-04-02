import java.util.*;
public class PrefixToInfix {
	static String prefixToInfix(String exp) {
		int k=exp.length();
		Stack<String> stack=new Stack<String>();
		String str,str2;
		for(int i=k-1;i>=0;i--) {
			char ch=exp.charAt(i);
			str="";
			//str2="";
			if(Character.isLetterOrDigit(ch)) {
			
				str=str+ch;
				stack.push(str);
				
				}
			else {
				String op1=stack.pop();
				String op2=stack.pop();
				str =op2+ch+op1;
				stack.push(str);				
			}
		}
		return stack.peek();
	 
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String exp=sc.next();
		String str=prefixToInfix(exp);
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
			}
		

}
}
