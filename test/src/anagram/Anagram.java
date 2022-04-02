//                        BY ITTERATING FOR LOOP AND CECKING EACH CHARACTER OF ONE WITH ANOTHER WHOLE STRING
package anagram;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.next();
		String str2=sc.next();
		int i=0;
		if(str.length()==str2.length())
		{
			char ch[]=str.toCharArray();
			char ch2[]=str2.toCharArray();
			for( i=0;i<str.length();i++)
			{
				for(int j=0;j<str2.length();j++)
					{if(ch[i]==ch2[j])
						ch2[j]=' ';
					else continue;}
				
			}
			for(i=0;i<str.length();i++)
			{	if(ch2[i]!=' ')
				{
					System.out.println("not an anagram");break;
				}
			else
				if(i==str.length()-1) System.out.println("Anagram String");
				
			}
		}
		else System.out.println("not an anagram");
	//	System.out.println(str2);
		
		
		

	}

}
