package Practice;
class Counter{
	static int count =0;
	public void counting()
	{
		count++;
		System.out.println(count);
		
		
	}
	
}

public class Static2 {

	public static void main(String[] args) {
		Counter c1=new Counter();
		c1.counting();
		Counter c2=new Counter();
		c2.counting();
		Counter c3=new Counter();
		c3.counting();

	}

}
