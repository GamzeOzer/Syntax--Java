package class16;

public class Car {
	String make;
	String model;
	String color;
	int door;
	int wheel;
	
	

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.make="Honda";
		car1.model="Civic";
		car1.color="Black";
		car1.door=4;
		car1.wheel=4;
		
		//Car Honda has 4 wheels
		
		System.out.println("Car "+car1.make+ " has "+ car1.wheel+ " wheels");
		
		car1.drive();
		car1.reverse();
		car1.stop();
		
	
		
		
		Car car2= new Car();
		car2.make="Tesla";
		car2.model="x";
		car2.color="Red";
		car2.door=4;
		car2.wheel=4;
		
		//My car is red tesla
		System.out.println("My car is "+car2.color+ " "+car2.make);
	}
	
	void drive() {
		System.out.println("Car can drive");
	}
	
	void reverse() {
		System.out.println("Car can reverse");
	}
	
	void stop() {
		System.out.println("Car can stop");
	}
	
	
	

}
