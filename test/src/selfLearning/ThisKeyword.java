package selfLearning;
class Test{
	int i;
	void setVal(int i) {
		this.i=i;
	}
	void show() {
		System.out.println(" i ="+ i);
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		Test t=new Test();
		t.setVal(1500);
		t.show();
		
	}

}
