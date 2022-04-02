package anagram;
import java.util.Scanner;

public class Anagram2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s2=sc.next();
		String str=sc.next();
		char[] ch1=s2.toCharArray();
		char[] ch2=str.toCharArray();
		boolean visited[]=new boolean[s2.length()];
		boolean isAnagram=false;
		int i=0;
		if(s2.length()==s2.length())
		{
			for(i=0;i<s2.length();i++)
			{       isAnagram=false;
				char ch=s2.charAt(i);
				for(int j=0;j<str.length();j++)
				{
					if(ch==str.charAt(j) &&  visited[j]!=true)
					{
						visited[j]=true;
						isAnagram=true;
						if(visited[j])break;
					}
				}
				if(!isAnagram)
					{
					   System.out.println("1 not anagram");break;
					}
			}
		}
		else System.out.println("not anagram");
		if(isAnagram==true)System.out.println("Anagarm String");

	}

}
