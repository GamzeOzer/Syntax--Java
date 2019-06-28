package class27;

/*
 * 1. Write program as a student class   that has instance variables name and address.
 *  Create a constructor that will initialize those variables.
 *   Print name & address of given  student by the displayInfo method.
 */
public class Student {

	String name;
	String address;
	
	Student(String name,String address){
		this.name=name;
		this.address=address;
	}
	
	void displayInfo() {
		System.out.println("Student name is:"+this.name);
		System.out.println("Student address is:"+this.address);
	}
}
