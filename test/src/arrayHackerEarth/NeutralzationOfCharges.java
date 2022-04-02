package arrayHackerEarth;
import java.util.*;

public class NeutralzationOfCharges {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] ch1=str.toCharArray();
		//char[] ch2=new char[str.length()];
		int i=0,j=i+1,count=0;
		while(j<str.length()) {
			if(ch1[i]==ch1[j]) {
				i+=2;
				
			}
			else {
				i+=1;
				System.out.println(ch1[i]);
				count++;
			}
			j=i+1;
		}
		System.out.println(count+1);
		
		
	}

}
