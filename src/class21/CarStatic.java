package class21;

public class CarStatic {
	public String color;//null
	public static int totalCars;//usually we made this public.//0
	
	

	public static void main(String[] args) {
		CarStatic car1=new CarStatic();
		car1.color="white";
		totalCars++;
		
		CarStatic car2=new CarStatic();
		car2.color="black";
		totalCars++;
		
		System.out.println("Total car we made is "+totalCars);
		
	}

}
