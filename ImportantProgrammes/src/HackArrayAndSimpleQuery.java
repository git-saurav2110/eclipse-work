import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackArrayAndSimpleQuery {
	
	static void print(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	

    public static void main(String[] args) throws IOException {
    	//Scanner sc=new Scanner(System.in);
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String s=br.readLine();
       String[] str=s.split(" ");
       int N=Integer.parseInt(str[0]);
       String data=br.readLine();
       String[] dataArray=data.split(" ");
       int [] arr = new int[N];
       for(int i=0;i<N;i++) {
    	   int val= Integer.parseInt(dataArray[i]);
    	  arr[i]=val;
       }
       int T=Integer.parseInt(str[1]);
       for(int i=0;i<T+1;i++) {
    	   String q=br.readLine();
    	   String [] qry=q.split(" ");
    	   int a=Integer.parseInt(qry[0]);
    	   int l=Integer.parseInt(qry[1]);
    	   int r=Integer.parseInt(qry[2]);
    	  // int k=r-l+1;
    	   if(a==1) {

    			   int d=0;
       			for(int p=l-1;p<r;p++) {
       				int j=p;
       				while(j!=d) {
       					int temp=arr[j];
       					arr[j]=arr[j-1];
       					arr[j-1]=temp;
       					j--;
       					print(arr);
       				}
       				d++;
    		   }
    		   print(arr);
    		  
    	   }
    	   else if(a==2){
    		   System.out.println("--------");
                  int d=l;
    			for(int p=r;p<arr.length;p++) {
    				int j=p;
    				while(j!=d-1) {
    					int temp=arr[j];
    					arr[j]=arr[j-1];
    					arr[j-1]=temp;
    					j--;
    					print(arr);
    				}
    				d++;
    			}
    			System.out.println("--------");
    		  
    	   }
    	   
       }
       
      

    }
}