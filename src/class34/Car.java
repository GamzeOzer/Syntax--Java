package class34;

public class Car {

	private String model;
	private String make;
	
	public Car(String model,String make) {
		this.model=model;
		this.make=make;
	}
	
	public void printCarDetails() {
		System.out.println("Make is "+make+" and model "+model);
	}
}
