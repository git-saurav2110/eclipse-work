package royAndProfilePicture;
import java.util.Scanner;

public class Profilepicture {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int L=sc.nextInt();
		int N=sc.nextInt();
		int w,h;
		for(int i=1;i<=N;i++)
		{
			w=sc.nextInt();
			h=sc.nextInt();
			if(w<L || h<L)
				System.out.println("UPLOAD ANOTHER");
			else if(w>=L || h>=L)
			
				{if(w==h)
				System.out.println("ACCEPTED" );
			    if((w>L || h>L) && (w!=h))
				System.out.println("CROP IT");
				}

		}/*180
5
640 480
120 300
180 180
400 400
200 180*/

	}

}
