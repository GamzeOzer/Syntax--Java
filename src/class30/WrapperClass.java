package class30;

public class WrapperClass {

	public static void main(String[] args) {
		
		
		//one way
		Integer integer1=new Integer(10);//Boxing
		//we pass the value 10
		System.out.println(integer1);
		
		
		//second way
		Integer integer2=10;//AutoBoxing
		
		
		//First way
		int num=integer1.intValue();//unboxing
		System.out.println(num);
		
		
		//second way
		int num2=integer2;//AutoUnBoxing
		
	}

}
