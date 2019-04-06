package class17_2;

public class Pyramid {

	public static void main(String[] args) {
		
		Pyramid pyr=new Pyramid();
		
		pyr.pyramidPattern();
		}
	void pyramidPattern(){
		/* I want to print pattern * * * ** * *** * **** */for (int i = 0; i < 4; i++) {
			for (int y = 0; y <= i; y++) {
				System.out.print("*");
			}
			System.out.println();}
	}
	
	
	
}
