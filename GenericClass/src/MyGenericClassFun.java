
public class MyGenericClassFun {

	public static void main(String[] args) {
		Integer[] a= {1,2,3,4};
		MyGenericClass<Integer> mg=new MyGenericClass<>();
		mg.setArray(a);
		Integer[] arr=mg.getArray();
		mg.printElement(arr);
	}
}
