
public class GenericInterfaceImplementation<E> implements GInterface<E> {
	
	private E e;

	@Override
	public void setValue(E e) {
		// TODO Auto-generated method stub
		this.e=e;
		
	}

	@Override
	public E getValue() {
		// TODO Auto-generated method stub
		return e;
	}
	

}
