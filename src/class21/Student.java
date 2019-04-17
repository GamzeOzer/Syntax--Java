package class21;

public class Student {
	
	/*
	 * 2.  Create a Class called Students

Create three  variables  studentName , studentID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
	 */
	
	String studentName;
	int studentID;
	static int numberOfStudents;

	public static void main(String[] args) {
		Student student1=new Student();
		numberOfStudents++;
		Student student2=new Student();
		numberOfStudents++;
		Student student3=new Student();
		numberOfStudents++;

		
		student1.studentName="gazmze";
		student2.studentName="arda";
		student3.studentName="ayse";
		
		student1.studentID=1;
		student2.studentID=2;
		student3.studentID=3;
		
		System.out.println(numberOfStudents);


		
		

		
	}

}
