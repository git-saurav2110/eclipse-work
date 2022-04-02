package zoo;
import java.util.*;

public class ZooProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=20,i=0,x=0,y=0;
       char[] string=sc.next().toCharArray();
       //char[] com = sc.next().toCharArray();
       for(i=0;i< string.length;i++)
       {
    	   if(string[i]=='z')
    		   x++;
    	   if(string[i]=='o')
    		   y++;
    		   
       }
       if(2*x==y)
    	   System.out.println("Yes");
       else
    	   System.out.println("No");
	
}
}