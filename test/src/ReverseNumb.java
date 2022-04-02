import java.util.*;


class ReverseNumb{
   public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int N=sc.nextInt();
         for(int i=0;i<N;i++){
           Stack<Character> stack=new Stack<Character>();
            String str=sc.next();
            for(int j=str.length()-1;j>=0;j--){
               char ch=str.charAt(j);
               stack.push(ch);
               
              }
            System.out.print(stack.toString());
            System.out.println();
            stack.removeAllElements();
         }
}
}