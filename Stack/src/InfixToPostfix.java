import java.util.*;
public class InfixToPostfix {
	static int prec(char c) {
		switch (c)
		{
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return -1;
			
		}
	}
	
   static String	InfixToPostfixExp(String exp) {
	   
	   Stack<Character> stack=new Stack<Character>();
	   String output="";
	   
	   for(int i=0;i<exp.length();i++) {
		   char c=exp.charAt(i);
		   
		   if(Character.isLetterOrDigit(c)) 
			   output+=c;
		   else if(c=='(')
			   stack.push(c);
		   else if(c==')') {
			   while(!stack.isEmpty() && stack.peek() != '(') 
			   {
				   output+=stack.pop();
			   }
			   if(!stack.isEmpty() && stack.peek()!='(')
				   return "invalid exp:";
			   else
				   stack.pop();
		   }
		   else
		   {
			   while(!stack.isEmpty() && prec(c)<=prec(stack.peek())) {
				   if(stack.peek() == '(') 
						return "Invalid Expression"; 
				   output+=stack.pop();
			   }
			   stack.push(c);
		   }
		   
	   }
	   
	   while(!stack.isEmpty()) {
		   if(stack.peek()=='(') return "Invalid exp:";
		   output+=stack.pop();
	   }
	   return output;
   }
	
	
	
	
	
	
	public static void main(String [] args) {
		String exp="a+b*(c^d-e)^(f+g*h)-i";
		System.out.println(InfixToPostfixExp(exp));
	}

}
