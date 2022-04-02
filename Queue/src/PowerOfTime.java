import java.util.*;
class PowerOfTime{
	
    static void MPT(int k){
    	Scanner sc=new Scanner(System.in);
    	
        
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int k=sc.nextInt();
        Queue<Integer> q=new LinkedList<>();
    	int[] call=new int [k];
    	for(int i=0;i<k;i++) {
    		
    		q.offer(sc.nextInt());
    	}
    	for(int i=0;i<k;i++) {
    		call[i]=sc.nextInt();
    	}
    	int i=0;int count =0;
    	while(!q.isEmpty()) {
    		if(call[i]==q.element()) {
    			q.poll();
    			i++;
    			if(i==k)break;
    		}
    		else {
            	q.offer(q.poll());
    			count++;
    	        }
    	}
    	System.out.println(count+k);

    }
}