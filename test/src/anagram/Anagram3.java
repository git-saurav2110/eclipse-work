package anagram;
import java.util.*;

public class Anagram3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();boolean[] visited;int a=0;
		for(int i=0;i<T;i++)
		{   a=0;
			String str1=sc.next();
			String str2=sc.next();
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
			int k=str1.length()>=str2.length()?str1.length():str2.length();
			visited=new boolean[k];
			for(int i1=0;i1<str1.length();i1++)
				{
				for(int j=0;j<str2.length() && visited[j]==false;j++)
				{
					if(ch1[i1]==ch2[j])
						{
						 visited[j]=true;
						 a++;
						 break;
						
						 
						}
					
				}
				}
			System.out.println(str1.length()+str2.length()-2*a);
			
			
		}
			
		

	}

}
