package file_read.java;
import java.io.*;
import java.util.*;
import java.math.BigInteger;

class ReadFile 
{
	public static void main(String args[]) throws IOException
	{ 
		 Scanner sc=new Scanner(System.in);
	        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8")));
	        String line=new String();
	        while(sc.hasNext()){
	            BigInteger a=sc.nextBigInteger();
	            BigInteger b=sc.nextBigInteger();
	            out.println(a.add(b));
	            out.flush();
	}
	}
}