package class17;

public class Greeting {

	public static void main(String[] args) {

		Greeting obj =new Greeting ();
		obj.hello();
		
		obj.findLargest();
		obj.findLargest2(30, 45);//calling the method and passing values
		obj.helloInstructor("Wegas");
		
	}
	
	void hello() {
		System.out.println("Hello");//in order to use thid method we need to create an obj
	}
	
	void helloInstructor(String name) {
		System.out.println("Hello "+name);
	}
	
	void findLargest() {
		//how to find largest number
				int a=10;
				int b=20;
				if (a>b) {
					System.out.println("A is larger than B");
				}else {
					System.out.println("B is larger than A");
				}
	}
	void findLargest2(int a,int b) {
		//how to find largest number
			
				if (a>b) {
					System.out.println("A is larger than B");
				}else {
					System.out.println("B is larger than A");
				}
	}
	

}
