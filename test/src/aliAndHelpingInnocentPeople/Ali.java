package aliAndHelpingInnocentPeople;
import java.util.Scanner;

public class Ali {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] ch=str.toCharArray();
		int i=0;boolean check=false;int sum;
		for(i=0;i<str.length();i++)
		{   sum=0;
			check=false;
			if(i==2)
				{
				if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='Y')
					check=true;
				
				}
			else if(i==0 ||i==3||i==4||i==7)
			{
				sum=ch[i]+ch[i+1]-2*'0';
				//System.out.println(sum);
				if(sum%2==0)
					check=true;
				else
					break;
				}
			else if(i==1||i==5||i==6) {
				check=true;
				continue;
			}
				if(!check)
					System.out.println("check");
					break;
				
			
		}
		if(check==true)System.out.println("valid");
		else System.out.println("invalid");

	}

}
