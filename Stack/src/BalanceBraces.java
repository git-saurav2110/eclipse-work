import java.util.*;
class BalanceBraces{
    static boolean balance(String exp){
        if(exp.length()%2 !=0){
            return false;
        }

        Stack<Character> stack= new Stack <Character>();
        for(int i=0;i<exp.length();i++){
        	   char ch=exp.charAt(i);
        	      if(stack.isEmpty()) stack.push(ch);
        	      
        	      else if(ch=='(' || ch=='{' || ch=='['){
                       stack.push(ch);
                   }
                   else if(ch==')'){
                       if(stack.peek() !='(') return false;
                       else stack.pop();

                   }
                   else if(ch=='}'){
                       if(stack.peek() !='{') return false;
                       else stack.pop();
                   }
                   else if(ch==']'){
                       if(stack.peek()!='[') return false;
                       else stack.pop();
                   }
            }

        if(stack.isEmpty()) return true;
        else return false;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
              String str=sc.next();
              if(balance(str))
              System.out.println("YES");
              else if(!balance(str))
              {
                  System.out.println("NO");
              }
        }
        
    }
}