package armstrongNumber;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		int r,sum=0,digit,temp;
		for(int j=100;j<1000;j++)
		{
			sum=0;
			temp=j;
			while(temp!=0)
			{
				r=temp%10;
				temp/=10;
				digit=r*r*r;
				sum=sum+digit;
				//System.out.println(sum);
			}
			if(sum==j)
				System.out.println(j +" : is armstrong number");
			
			//System.out.println(j);
		}

	}

}
