package movement;
import java.util.Scanner;

public class MovementOfPosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=0;
		int y=0;
		int i=0,j=0;
		//char[] com= new char[201];
		//String str="LLRDDR";
		
		char[] com = sc.next().toCharArray();
	
		while(i<com.length)
		{
			if(com[i]=='L')
				x-=1;
			else if(com[i]=='R')
			     x+=1;
			else if(com[i]=='D')
				y-=1;
			else if(com[i]=='U')
				y+=1;
			i++;
		}
		System.out.print(x+" "+y);
		
		
	}

}
