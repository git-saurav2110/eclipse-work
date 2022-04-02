import java.util.*;
class Jumpy{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<Integer>();
        int N=sc.nextInt();
        int [] arr=new int[N];
        int [] s=new int [N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
       
        for(int i=arr.length-1;i>=0;i--){
           if(!stack.isEmpty()){
            if(arr[i]<arr[stack.peek()]){
                s[i]=(arr[i]  ^ s[stack.peek()]) ;
            }
            else {
            	 s[i]=arr[i];
            	 stack.removeAllElements();
            }
           }
           else {
             s[i]=arr[i];
            
        }
           stack.push(i);
 }
       
        int max=s[0];
        int  i=0;
        while( i<N){
            if(s[i]>max)
            max=s[i];
            i++;
        }
        System.out.print(max);

    }
}