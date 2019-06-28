package class25;

public class SyntaxStudent extends Student{

	public void study() {
		System.out.println("Syntax Student must study hard");
	}
	
	protected void doHomework() {
		System.out.println("Syntax Student must do Repl");
	}
	
	 void attendClasses() {
		System.out.println("Syntax Student must attend classes ");
	}

	 //Creating child specific private method doResearch
	 private void doResearch() {
			System.out.println("Syntax Student must do uncle google bestfriend");
		}

}
