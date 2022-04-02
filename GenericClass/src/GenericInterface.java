
public class GenericInterface {

	public static void main(String[] args) {
		GenericInterfaceImplementation<String > g=new GenericInterfaceImplementation<>();
		g.setValue("Hello");
		String s=g.getValue();
		System.out.print(g.getValue()+" "+s);
		
		System.out.println("\n========================================");
		
		GenericImpl2 g2=new GenericImpl2();
		g2.setValue("world");
		String es=g2.getValue();
		System.out.println(es);
		
	}
}
