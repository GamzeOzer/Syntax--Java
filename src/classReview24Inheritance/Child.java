package classReview24Inheritance;

public class Child extends Parent {
	
	Child(){
		System.out.println("I am from child class");
	}

	public static void main(String[] args) {
		Child obj=new Child();
		
		System.out.println(obj.Reverse("Gamze"));
		System.out.println(obj.Reverse("one", "two"));
		
		System.out.println(obj.checkBoolean(false, false));
	}

}
