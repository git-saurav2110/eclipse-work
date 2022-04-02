package Practice;

public class StaticBlocks {
	static {
		System.out.println("static 1 ");
	}
static {
	System.out.println("Static 2");
}
	public static void main(String[] args) {
		System.out.println("main methd");
	}
	static {
		System.out.println("Static 3");
	}

}
