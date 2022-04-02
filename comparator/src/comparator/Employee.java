package comparator;


public  class Employee {
	int id;
	String name;
	String Address;
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}
	
	public int compareTo(Employee o) {
		
		int idc= this.id-o.id;
		int namec=this.name.compareTo(o.name);
		
		return namec==0? idc : namec;
		
	}
	
	
	
}

