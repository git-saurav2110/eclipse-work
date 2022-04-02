
public class GenericImpl2 implements GInterface<String>{

	private String e;
	@Override
	public void setValue(String e) {
		// TODO Auto-generated method stub
		this.e=e;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return e;
	}

}
