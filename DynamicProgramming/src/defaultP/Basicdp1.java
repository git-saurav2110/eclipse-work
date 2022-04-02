package defaultP;


public class Basicdp1 {
	static int nil=-1;
	static int max=100;
	static int [] lookUp=new int[100];
	static void initilize(int [] lookUp) {
		for(int i=0;i<max;i++) {
			lookUp[i]=nil;
		}
	}
	static int fib(int n) {
		if(lookUp[n]==nil) {
			if(n<=1) return n;
			return fib(n-1)+fib(n-2);
		}
		return lookUp[n];
	}
	public static void main (String[] args) {
		initilize(lookUp);
		System.out.println(fib(10));
	}
}

