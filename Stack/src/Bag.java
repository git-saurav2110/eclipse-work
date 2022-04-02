import java.util.*;
class Bag{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stack1 = new Stack<Integer>();
        int k ;
       while(sc.hasNextInt()) {
    	   k=sc.nextInt();
    	   stack.add(k);
    	   if(!sc.hasNextInt()) break;
    	   
       }
        sc.close();
        while(!stack.isEmpty()) {
        	stack1.push(stack.pop());
        }
        while(!stack1.isEmpty()){
        System.out.print(stack1.peek()+" ");
        stack1.pop();
        }
    }
}