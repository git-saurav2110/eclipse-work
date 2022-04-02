/*You are given length of n sides, you need to answer whether it is possible to make n sided convex polygon with it.

Input : -

First line contains T ,no .of testcases.

For each test case , first line consist of single integer N ,second line consist of N(l1,l2,l3)spaced integers, size of each side.

Output : -

For each test case print "Yes" if it is possible to make polygon or else "No" if it is not possible.*/

package arrayHackerEarth;
import java.util.Scanner;

public class PolygonPossiblity {
   public int Sum(int [] a)
   {
	   int sum=0;
	   for(int i=0;i<a.length;i++)
		   sum+=a[i];
	   return sum;
   }
	public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
           
   for(int i=0;i<T;i++)
   {
	   boolean b=false;
	   int N=sc.nextInt();
	   int [] length=new int[N];
	   for(int j=0;j<N;j++)
	   {
		   length[j]=sc.nextInt();
	   }
	   PolygonPossiblity p=new PolygonPossiblity();
	   int add=p.Sum(length);
        for(int k=0;k<N;k++)
        {
        	if(length[k]>= add/2)
        	{
        		b=true;
        		break;
        	}
        	if(b) break;
        	      
        }
        if(b)System.out.println("No");
        else System.out.println("Yes");  	
            	
    }
            
	}

}
