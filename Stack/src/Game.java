import java.util.*;

class Game{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> stack=new Stack<Integer>();
        Stack<Integer> stack1=new Stack<Integer>();
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            stack.push(k);
            stack1.push(k);
        }
        int A=stack.firstElement();
        int B=stack1.peek();
        while(! stack.isEmpty()){
        	 B=stack1.peek();
        	 A=stack.firstElement();
            if(A>B){
                System.out.print("1 ");
                stack1.pop();
               
            }
            else if(B>A){
                System.out.print("2 ");
                stack.removeElementAt(0);
               
            }
            else{
                System.out.print("0 ");
                stack1.pop();
                stack.removeElementAt(0);
              
            }

        }
    }
}