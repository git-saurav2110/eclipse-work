import java.util.*;
class DiskTower{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> stack=new Stack<Integer>();
        int k=sc.nextInt();
        int [] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<k;i++){
           if(arr[i]<arr[i+1]){
               stack.push(arr[i]);
               System.out.println();
               continue;
           }
          // stack.push(a[i]);
           else if(arr[i]>arr[i+1]){
        	   stack.push(arr[i]);
               while(!stack.isEmpty()){
                   System.out.print(stack.pop()+" ");
                   
               }

           }
        }


    }
}
