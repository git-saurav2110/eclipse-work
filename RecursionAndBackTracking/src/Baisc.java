
public class Baisc {
	static int print(int k) {
		if(k==0) return 0;
		else {
			System.out.print(k+" ");
		
			return print(k-1);
		}
		
	}
	public static void main(String [] args) {
		System.out.print(print(5));
	}
}
