package class21;

public class Employee {
	int eID;
	int salary;
	static String CEO="Sumair";

	public static void main(String[] args) {
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		
		employee1.eID=1;
		employee2.eID=2;
		
		employee1.salary=4000;
		employee2.salary=5000;
		
		employee1.getInfoEmployee();
		employee2.getInfoEmployee();
	
	}
	void getInfoEmployee() {
		System.out.println("Employee id id "+ eID+ ", salary is "+ salary+" and CEO is "+CEO);
	}

}
