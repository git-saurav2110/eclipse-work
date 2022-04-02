package recursion;
import java.util.Scanner;
class Fun{
	public static int facto(int n) {
	       if(n==0)return 1;
	       else return n*facto(n-1);
		
	}
}

public class Recursion {
	

	public static void main(String[] args) {
		Fun fact=new Fun();
	 System.out.println(Fun.facto(4));  	
	}

}
