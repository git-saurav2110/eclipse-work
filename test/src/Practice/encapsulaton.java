package Practice;
class Employee{
	private int emp_id;
	public void setEmpid(int EmpId) {
		emp_id=EmpId;
	}
	public int getEmpid() {
		return emp_id;
	}
}

public class encapsulaton {

	public static void main(String[] args) {
             Employee saurav=new Employee();
             saurav.setEmpid(104);
            System.out.println( saurav.getEmpid());
	}

}
