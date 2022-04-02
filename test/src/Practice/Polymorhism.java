//   METHOD OVERLOADING
package Practice;
class Show{
	void show(int a) {
		System.out.println("1");
	}
	void show() {
		System.out.println("8");
	}
}

public class Polymorhism {

	public static void main(String[] args) {
		Show sh=new Show();
		sh.show();
		

	}

}
