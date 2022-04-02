package anagram;

import java.util.*;


//Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
 public static void main(String args[] ) throws Exception {
     Scanner sc=new Scanner (System.in);
     int T=sc.nextInt();int i=0;
     for(int k=0;k<T;k++)
     {
     String str=sc.next();
     int j=str.length();
     char[] ch=new char[j];boolean bool=false;ch=str.toCharArray();
     for( i=0;i<j/2 ;i++)
     {
    	 bool=false;
         if(ch[i]!=ch[j-i-1])   {
        	 bool=true;
        	 break;
         }
     }
     System.out.println(i+" "+bool);
     if(bool==true)System.out.println("NO");
     else if(bool==false){ if(j%2==0)
          System.out.println("YES EVEN");
          else
          System.out.println("YES ODD");
     }
    
     }

 }
}

