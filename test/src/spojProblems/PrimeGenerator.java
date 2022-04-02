package spojProblems;
import java.util.Scanner;

public class PrimeGenerator {
	public boolean isPrime(int j) {
		if(j==1)return false;
		for(int k=2;k*k<=j;k++) {
			if(j%k==0) {
				return false;
			}
			
		}
		return true;
		
	}
	public static void main(String [] args) {
		PrimeGenerator pg=new PrimeGenerator();
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++) {
			int m=sc.nextInt();
			int n=sc.nextInt();
			for(int j=m;j<=n;j++) { 
				    boolean b=pg.isPrime(j);
				    if(b)System.out.println(j);
				
			}
		}
		
	}
}

