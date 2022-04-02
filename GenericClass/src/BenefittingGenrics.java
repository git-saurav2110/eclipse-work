
import java.util.*;
public class BenefittingGenrics {
	
	public static void main(String [] args) {
		Generic<String> g=new Generic<String>();
		g.setObject("My name is Saurav kumar");
		System.out.println(g.getObject());
		
		System.out.println("\n------------------");
		GenericList<Integer> gList=new GenericList<>();
		List<Integer> list=new ArrayList();
		list.add(12);
		list.add(14);
		list.add(16);
		gList.setList(list);
		System.out.println(gList.getList());
		System.out.println("\n------------------");
		GenericList<String> gl=new GenericList<>();
		List<String> sl=new LinkedList<>();
		sl.add("My ");
		sl.add("name is");
		sl.add(" Saurav Kumar");
		
		gl.setList(sl);
		for(String s : sl) {
			System.out.print(s);
		}
		
		System.out.println("\n------------------");
		GenericMap<Integer,String> map=new GenericMap<Integer,String>(1001,"hello");
		System.out.print(map.getKey()+" "+ map.getValue());
	}

}
