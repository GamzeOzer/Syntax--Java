package class25;

public class Student {
	public void study() {
		System.out.println("Student must study");
	}
	
	protected void doHomework() {
		System.out.println("Student must do homework");
	}
	
	void attendClasses() {
		 System.out.println("Student must attend classes");
	}
	//Private methods cannot be overriden
	 
	 private void doResearch() {
			System.out.println("Student must do research");
		}




}
