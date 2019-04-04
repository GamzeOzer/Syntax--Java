package class16;

public class Computer {
	
	String os,brand;
	boolean mouse, keyboard;
	int screen, ram;
	
	
	void watchMovie() {
		System.out.println("We can watch movie on a computer "+brand);
	}
	
	void doJavaCoding() {
		System.out.println("We can do Java coding on a computer "+brand);
	}
	void playMusic() {
		System.out.println("We can play music on a computer "+brand );
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer com1 =new Computer();
		com1.keyboard=true;
		com1.mouse=true;
		com1.os="Windows";
		com1.ram=8;
		com1.screen=2;
		com1.brand="HP";
		
		
		com1.doJavaCoding();
		com1.playMusic();
		com1.watchMovie();
		
		
		
		Computer com2 =new Computer();
		
		com2.keyboard=true;
		com2.mouse=true;
		com2.os="Mac OS";
		com2.ram=6;
		com2.screen=4;
		com2.brand="Apple";
		
		com2.doJavaCoding();
		com2.playMusic();
		com2.watchMovie();

	}

}
