package Practice;
class Worker{
	String name;
	int empid;
	static String company ="apple";
	void display() {
		System.out.println(empid+"---"+name+"----"+company);
	}
	Worker(String name,int empid )
	{
		this.name=name;
		this.empid=empid;
		//this.company=company;
	}
	
}

public class Static {
 
	
	public static void main(String[] args) {
		Worker e1=new Worker("raj",100);
		e1.display();
		Worker e2=new Worker("ram",101);
		e2.display();
		
		
	}

}
