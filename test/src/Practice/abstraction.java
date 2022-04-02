package Practice;
interface i4{
	void inter();
}
abstract class Vehicle{
	abstract void start();
	void show() {
		System.out.println("i am a disco dancr");
	}
	
}
class Car extends Vehicle
{
	void start() {
		System.out.println("Start with keys");
	}
	
}
class Scooter extends Vehicle{
	void start() {
		System.out.println("starts with kick");
	}
	
}
public class abstraction {

	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		Scooter s= new Scooter();
		s.start();
		c.show();
	
	}

}
