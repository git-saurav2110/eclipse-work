package Practice;
class B{
	B(){
		System.out.println("b constructor");
	}
	void m1() {
		System.out.println("i m in B");
	}
}
class A extends B{
	int a=20;
    A()
	{
    	super();
		System.out.println("A constructor");
		
	}
	
}
public class Super {

	public static void main(String[] args) {
	  A a=new A();
	  ;

	}

}
