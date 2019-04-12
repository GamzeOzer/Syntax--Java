package class21;

public class InstanceVariables {
	
	protected String name="John";

	public static void main(String[] args) {
	
		
		String name="Anna";
		System.out.println(name);
		
		System.out.println("-------Changing value of local variable-------");
		name="Olga";
		System.out.println(name);
		
		//Creating 1 object
		InstanceVariables obj1=new InstanceVariables();
		System.out.println(obj1.name);
		System.out.println("-------Changing value of instance variable-------");
		obj1.name="obj1";
		System.out.println(obj1.name);
		
		
		//Creating 2. object
		InstanceVariables obj2=new InstanceVariables();
		System.out.println(obj2.name);
		obj2.name="obj2";
		System.out.println(obj2.name);
		
		
		
		
	
	}
	public void hello(String name ) {
		System.out.println("Hello "+name);
	}

}
