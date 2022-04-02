
public class MyGenericClass<T> {

	private T[] arr;
	public void setArray(T[] arr) {
		this.arr=arr;
	}
	public T[] getArray() {
		return arr;
	}
	public <E> void printElement(E[] arr) {
		for(E e: arr) {
			System.out.println(e);
		}
	}
}
