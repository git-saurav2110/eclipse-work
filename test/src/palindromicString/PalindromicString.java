package palindromicString;

import java.util.*;

public class PalindromicString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] str=sc.next().toCharArray();
		int i=0,j=str.length;
		int flag=0;
		for(i=0;i<j/2;i++)
		{
			if(str[i]==str[j-i-1])
				{
				flag=0;
				continue;
				}
			  
			else
				{
				flag=1;
				break;
				}
		}
		if(flag==0)
			System.out.print("YES");
		else
			System.out.print("NO");

	}

}
