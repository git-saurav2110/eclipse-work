package array;
import java.util.Scanner;

public class ArrangingNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] stud=new int [n];
		for(int i=0;i<n;i++) {
			stud[i]=sc.nextInt();
		}
		int max=stud[0];
		int min=stud[0];
		for(int j=0;j<n;j++)
		{
			if(stud[j]>max)
				max=stud[j];
			else if(stud[j]<min)
				min=stud[j];
			
				
				
		}System.out.println(max);
	     System.out.println(min);

	}

}
