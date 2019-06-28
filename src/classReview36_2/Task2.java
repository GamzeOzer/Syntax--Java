package classReview36_2;

//* void nullPointer() method to be able 
//to throw NullPointerException Invalid
//* use of a null reference.
public class Task2 {
	
	void nullPointer(String a) throws NullPointerException {
		System.out.println(a.length());
		 
	}

	public static void main(String[] args) {
		Task2 obj=new Task2();
		try {
		obj.nullPointer(null);
		}catch(NullPointerException e) {
			System.out.println(e);
		}
	}

}
