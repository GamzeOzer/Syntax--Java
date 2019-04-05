package class17;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		
		String str="Hello";
		int stringLength=str.length();
		System.out.println(stringLength);
		
		char character=str.charAt(5);
		System.out.println(character);
		
		MethodWithReturnValue obj=new MethodWithReturnValue();

		String day=obj.whatIsDay();
		
		System.out.println("Today is "+ day);
		
		
		int largestNumer=obj.findLargest2(78,90);  //-----90 assign edeilir
	}
	
	
	String whatIsDay() {
		System.out.println("I am inside a method");
		return "Thursday";
	}
	
	int findLargest2(int a,int b) {
		//how to find largest number
			
				if (a>b) {
				   return a;	//System.out.println("A is larger than B");
				}else {
					return b;  //System.out.println("B is larger than A");
				}
	}
	
	int findLargest3(int a,int b) {
		//how to find largest number
			int largest;
				if (a>b) {
				   largest=a;  //return a;	//System.out.println("A is larger than B");
				}else {
					largest=b;//return b;  //System.out.println("B is larger than A");
				}
				return largest;
				
				
	}
	

}
