import java.util.*;
public class GenericList<T> {
 
	private List<T> list;
	
	public List<T> getList(){
		return list;
	}
	
	public void setList(List<T> list) {
		this.list=list;
	}
}
