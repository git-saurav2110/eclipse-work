
public class SimpleRecursivePrint {
	static int print(int n) {
		if(n==0) return 0;
		else {
			System.out.println(n);
			return print(n-1);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(print(5));

	}

}
