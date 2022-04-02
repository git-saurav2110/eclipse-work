package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStudent {
	
	
	
	public static void main(String[] args) {
		/*
		 * List<Students> ls=new ArrayList<Students>();
		 * 
		 * ls.add(new Students(35,"ram")); ls.add(new Students(38,"shyam")); ls.add(new
		 * Students(40,"Mohan")); ls.add(new Students(35,"Harsh")); ls.add(new
		 * Students(66,"Prabhu")); ls.add(new Students(35,"Gopi"));
		 * 
		 * Collections.sort(ls);
		 * 
		 * ls.forEach(System.out:: println);
		 */
		
		ArrayList<Employee> emp=new ArrayList();
		emp.add(new Employee(20,"Shyam","Patna"));
		emp.add(new Employee(21,"Gajju","Hyd"));
		emp.add(new Employee(20,"Maya","BGT"));
		emp.add(new Employee(21,"Lalan","Blchi"));
		emp.add(new Employee(18,"Maya","BGT"));
		
		//Collections.sort(emp,new SortByNameThenAddress());
		
		
		/*
		 * Collections.sort(emp, new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) {
		 * if(o1.name.compareTo(o2.name)==0) { return
		 * o1.getAddress().compareTo(o2.getAddress()); }
		 * 
		 * return o1.getName().compareTo(o2.getName()); }
		 * 
		 * });
		 */
		
		
		
		/*
		 * Collections.sort(emp,(Employee o1, Employee o2) ->{
		 * if(o1.name.compareTo(o2.name)==0) { return
		 * o1.getAddress().compareTo(o2.getAddress()); }
		 * 
		 * return o1.getName().compareTo(o2.getName());
		 * 
		 * });
		 */
		
		
		//Collections.sort(emp,(o1, o2)-> o1.name.compareTo(o2.name) );
		
		
		Collections.sort(emp, Comparator.comparing(Employee:: getName).
				thenComparing(Employee :: getAddress).thenComparing(Employee :: getId).reversed());
		
		emp.forEach(System.out:: println);
		
		
		
	}

	

}

class SortByNameThenAddress implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.name.compareTo(o2.name)==0) {
			return o1.getAddress().compareTo(o2.getAddress());
		}
		
		return o1.getName().compareTo(o2.getName());
	}

}
