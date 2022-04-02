import java.util.*;
public class FindingFirstDuplicate {
	public static void main(String[] args) {
		int[] a= {1,5,2,3,1,2};     // all the elements should be 0<= E < a.length
		for(int i=0;i<a.length;i++) {
		if(a[Math.abs(a[i])]<0) {
			System.out.print(Math.abs(a[i]));
			break;
		}
		else  {
			a[Math.abs(a[i])]=-a[Math.abs(a[i])];
		}
		}
	}

}
