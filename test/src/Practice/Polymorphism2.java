//----------- MEthod overriding ------------   ABSTRACT CLASS ------------ INTERFACE ----------
package Practice;
class Tet{
	
	 void sho()
	{
		System.out.println("Show 1 method");
		
	}
}
class Show2 extends Tet
{
	 void sho()
	{
		super.sho();
		System.out.println("Show 2 method");
		super.sho();
	}
	
}

public class Polymorphism2 {

	public static void main(String[] args) {
		Show2 s=new Show2();
		s.sho();
	}

}
