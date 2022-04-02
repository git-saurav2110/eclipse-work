import java.util.*;
class Paranthesis{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
       
        Stack<Character> stack=new Stack<Character>();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
        if (ch=='(') {
        	stack.push(ch);
        	continue;
        }
        else if(!stack.isEmpty() && ch==')'){ 
              
              
                  if(stack.peek()=='(')stack.pop();
                  else count++;
                  continue;
              
              
            }
        count++;
       
            
        }
       
        while(!stack.isEmpty()){
            
            count++;
            stack.pop();
        }
        System.out.println(count);
    }
}