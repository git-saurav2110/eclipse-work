package primeNumber;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// You are given an integer N. You need to print the series of all prime numbers till N.
      Scanner sc=new Scanner(System.in);
      int a,i,j,flag;
      a=sc.nextInt();
      j=2;
      for(i=2;i<a;++i)
    	  {   flag=0;
    		//  if(i==1)
    			// continue;
    		  if (i==2 || i==3)
    			  System.out.print(i +" ");
    		  else if(i>3)
    		  {
    			for (j=2;j<= i/2;++j)
    			{
    				if(i%j==0)
    					{flag=1;
    				 break;}
    				
    			}
    				
    		if(flag==0)
    			System.out.print(i +" ");
    				
    				
    			
    			
    		  }
    		     
    		  
    			  
    		 
    	  }
      
	}

}
