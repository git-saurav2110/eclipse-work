
public class Factorial {
	static int Facto(int n) {
		if(n==0) {
			return 1;
		}
		else {
			System.out.println(n);
			return n*Facto(n-1);
			
		}
	}
	public static void main(String [] args ) {
		System.out.println(Facto(5));
	}

}
