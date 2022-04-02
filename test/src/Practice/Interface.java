package Practice;
interface i1{
	void show();
	default void sho() {
		System.out.println("@@@@");
			
	}
}
class test implements i1
{
	public void show() {
		System.out.println("222222");
	}
}
public class Interface {

	public static void main(String[] args) {
		test t=new test();
		t.sho();
		t.show();
		

	}

}
