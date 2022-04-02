import java.util.*;
class NumberRecovery{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<Integer> queue=new LinkedList<>();
        Stack<Integer> X=new Stack<Integer>();
        int N=sc.nextInt();
        int Q=sc.nextInt();
        int a[]=new int[N] , d[]=new int[N] , q1[]=new int [Q], q2[]=new int [Q];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
            d[i]=sc.nextInt();
        }
        for(int i=0;i<Q;i++) {
        	q1[i]=sc.nextInt();
        	q2[i]=sc.nextInt();
        }
        
        for(int i=0;i<Q;i++) {
        	if(q1[i]==3) {
        		System.out.println("-1");
        	}
        	else if(q1[i]==1) {
        		int k=q2[i];
        		X.push((a[q2[i]-1]-d[q2[i]-1]));
        		queue.add(X.peek());
        		if(X.peek()!=a[q2[i]-1]+d[q2[i]-1]) {
        		queue.add(a[q2[i]-1]+d[q2[i]-1]);
        		}
        		System.out.print(queue.size() +" ");
        		while(!queue.isEmpty()) {
        			System.out.print(queue.poll() + " ");
        		}
        		System.out.println();
        		
        		
        		
        	}
        	else if(q1[i]==2) {
        		int k=q2[i];
        		if(X.peek()-a[q2[i]-1] == d[q2[i]-1]) {
        			System.out.println("0");
        		}
        		else {
        			X.push(a[q2[i]-1] +d[q2[i]-1]);
        			System.out.println("1 " + X.peek());
        		}
        		
        		
        	}
        	
        }
        
    }
}