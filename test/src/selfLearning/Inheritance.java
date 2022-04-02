package selfLearning;

class A {
	void eat() {
		System.out.println("A method called");
		}
	}
class B extends A{
	void run() {
		System.out.println("B method called");
	}
}
class C extends A{
	 void bark() {
		System.out.println("C method called");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		C c=new C();
		c.eat();
		//c.run();
		c.bark();
		System.out.println("-----------------");
		B b=new B();
		b.eat();
		b.run();
		//b.bark();
		System.out.println("-----------------------");
		A a=new A();
		a.eat();
	}

}
