package classReview31;

/*
 * A university department consists of professors and secretaries.
 *  Each professor and each secretary has a name, a salary, and a hire date.
 *   Use inheritance and polymorphism to create an application that represents 
 *   the department and its professors and secretaries as objects, and provides 
 *   a test class that creates 3 professors and 2 secretaries, and then outputs 
 *   the combined total of all of their salaries.
 */

public abstract class StaffPerson {
	
	public StaffPerson(String name, int salary, String address, String vehicleType, String hireDate, int tellNum) {
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.vehicleType = vehicleType;
		this.hireDate = hireDate;
		this.tellNum = tellNum;
	}
	String name;
	int salary;
	String address;
	String vehicleType;
	String hireDate;
	int tellNum;
	
	public abstract String getVehicleType();
	public abstract int getSalary();
	public abstract String getName();
	public abstract String getAdress();
	public abstract int getTellNum();
	
	
}

class Secretary extends StaffPerson{

	public Secretary(String name, int salary, String address, String vehicleType, String hireDate, int tellNum) {
		super(name, salary, address, vehicleType, hireDate, tellNum);
			}

	@Override
	public String getAdress() {
		
		return super.address;
	}

	@Override
	public String getName() {
	
		return super.name;
	}

	@Override
	public int getSalary() {
		
		return super.salary;
	}

	@Override
	public int getTellNum() {
		
		return super.tellNum;
	}

	@Override
	public String getVehicleType() {
		
		return super.vehicleType;
	}
}
	
class Professor extends StaffPerson{

	public Professor(String name, int salary, String address, String vehicleType, String hireDate, int tellNum) {
		super(name, salary, address, vehicleType, hireDate, tellNum);
			}

	@Override
	public String getAdress() {
		
		return super.address;
	}

	@Override
	public String getName() {
	
		return super.name;
	}

	@Override
	public int getSalary() {
		
		return super.salary;
	}

	@Override
	public int getTellNum() {
		
		return super.tellNum;
	}

	@Override
	public String getVehicleType() {
		
		return super.vehicleType;
	}
}