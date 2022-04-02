package comparator;

public class Students implements Comparable<Students> {
	int rollNo;
	String name;
	
	
	public Students(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", name=" + name + "]";
	}



	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int compareTo(Students o) {
		
		int roll= this.rollNo - o.rollNo;
		int cname= this.name .compareTo(o.name);
		
		return cname==0? roll :cname;
	}

	

}
