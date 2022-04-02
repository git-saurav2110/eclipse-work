package liftProblem;
import java.util.Scanner;

public class LiftProblem {

	public static void main(String[] args) {
	 int A=0,j,n,d;
	 int B=7,i=0;
	 Scanner sc=new Scanner(System.in);
	 //System.out.println("enter t:");
	 int T=sc.nextInt();
	 int k;
	 for(i=0;i<T;i++)
	 {
		 //System.out.println("sk");
		  k=sc.nextInt();
		  j=B-k;
		  n=k-A;
		  if(j<0) j=-j;
		  if(n<0) n=-n;
		  
		  
		 if(j>n)
		 {
			 System.out.println("A");
		    A=k;
		 }
			 else if(j<n)
	     {
				 System.out.println("B");
				 B=k;
	     }
		 if(j==n) {
			 //d=B-A;
			 if(B<A)
				 System.out.println("B");
			 else if(B==A)
				 System.out.println("A");
			 else if(A<B)
				 System.out.println("A");
			 A=k;
				 
			 
		 }
		 }
		 
		 
			 
	 
	

	}

}
