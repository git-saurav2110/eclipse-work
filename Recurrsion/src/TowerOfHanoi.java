
public class TowerOfHanoi {
	static void TOH(int n,char A,char B,char C) {
		if(n==1) {
			System.out.println("DiSK MOVED FROM "+ A +" to "+C);
			return;
		}
		TOH(n-1,A,C,B);
		System.out.println("DiSK MOVED FROM ----- "+ A +" to "+C);
		TOH(n-1,B,A,C);
	}
	public static void main (String[] args) {
		int k=7;
		char A = 'A',B = 'B',C = 'C';
		TOH(k,A,B,C);
	}

}
