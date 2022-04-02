package geeksForGeeks;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
	    GFG arr=new GFG();
	    Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	   
	    for(int i=0;i<T;i++)
	    {
	        int sum=0,k=0,init=0;
	        int N=sc.nextInt();
	        int S=sc.nextInt();
	        int[] num=new int[N];
	        for(int j=0;j<N;j++){
	            num[i]=sc.nextInt();
	        }
	        while(sum!=S && k<num.length)
	        {
	            
	            sum+=num[k];k++;
	            init++;
	            if(sum>S){
	                sum=0;
	                init=0;
	            }
	        }
	        System.out.print(init+" "+k);
	        
	        
	        
	    }
	
	}
}