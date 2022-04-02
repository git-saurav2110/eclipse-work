import java.util.*;
public class InfixToPrefix {
	static String reverse(String str) {
		int l=str.length();
		char[] ch=str.toCharArray();
		char[] ch1=new char[l];
		for(int i=0;i<l;i++) {
			if(str.charAt(i)=='(')
				ch[i]=')';
			else if(str.charAt(i)==')') {
				ch[i]='(';
			}
		}
		for(int i=0;i<l;i++) {
			ch1[i]=ch[l-i-1];
		}
		String str1=Arrays.toString(ch1);
		
		return str1;
		
	}
	/*
	 * static String InfixToPrefixRes(String infix) { int l= infix.length();
	 * 
	 * 
	 * 
	 * }
	 */
	
	
	
	public static void main (String [] args) {
		String exp="A+(B*C-(D/E^F)*G)";
		System.out.println(reverse(exp));
		
	}

}
