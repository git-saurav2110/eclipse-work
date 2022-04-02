package table;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=0,j=0,c;
		for(i=1;i<11;i++)
		{
			for(j=1;j<21;j++)
			{
				c=j*i;
				System.out.print(c+"    ");
			}
			System.out.println(" ");
		}
		

	}

}
