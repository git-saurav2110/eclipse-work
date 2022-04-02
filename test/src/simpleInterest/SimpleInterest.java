package simpleInterest;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Princpal =sc.nextInt();
		float Rate=sc.nextFloat();
		int Time=sc.nextInt();
		float SimpleInterest=Princpal*Rate*Time/100;
		System.out.println("The Simple Interest is " + SimpleInterest);
		
		

	}

}
