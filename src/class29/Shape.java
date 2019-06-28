package class29;

/*
 * 1. Create an Interface ‘Shape’ with undefined methods as calculateArea()
 *  and calculatePerimiter(). Create 2 child classes: Circle & Square that 
 *  should have an implementation of area and perimeter calculation. Test your code.
 */

public interface Shape {
	
	void calculateArea(int r);
	void calculatePerimiter(int r);
	

}
 class Circle implements Shape {

	int r;
	static final double pi=3.14;
	
	
	@Override
	public void calculateArea(int r) {
		this.r=r;
		double area=pi*(r*r);
		System.out.println("Area of circle "+area);
		
	}

	@Override
	public void calculatePerimiter(int r) {
		this.r=r;
		double Perimiter=2*pi*r;
		System.out.println("Perimiter of circle "+Perimiter);
		
	}

}
 
  class Square implements Shape {

		int edge;
		
		
		@Override
		public void calculateArea(int edge) {
		    this.edge=edge;
			double area=edge*edge;
			System.out.println("Area of square "+area);
			
		}

		@Override
		public void calculatePerimiter(int edge) {
			this.edge=edge;
			double Perimiter=4*edge;
			System.out.println("Perimiter of square "+Perimiter);
			
		}

	}

