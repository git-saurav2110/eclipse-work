import java.util.*;
class Num{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        int [] arr = null;
        for(int i=0;i<K;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(K-1);
    }
}