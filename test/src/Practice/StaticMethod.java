package Practice;
class M1 {
	static int i=10;
	static void show(int i) {
	//	this.i=i;
		System.out.println("other class static method   "+ i );
	}
}

public class StaticMethod {
    static void display() {
		System.out.println("Static method @@@");
	}

	public static void main(String[] args) {
	//	M1 m=new M1();
		M1.show(10);
		display();

	}

}
