package Practice;

class Bird
{
	public void eat() {
		System.out.println("i am eating");
	}
	public void run()
	{
		System.out.println("i am running");
	}
}
class Sparrow extends Bird
{
	public void ha()
	{
		System.out.println("i am happy");
	}
}
class Sp extends Bird
{
	public void k() {
		System.out.println("i am sp");
	}
}
public class inheritance {

	public static void main(String[] args) {
		Sparrow s=new Sparrow();
		s.eat();
		s.run();
		System.out.println("-------------------");
		Sp sp= new Sp();
		sp.eat();
		sp.run();
		

	}

}
