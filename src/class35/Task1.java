package class35;


	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class Task1 {

	    public static void main(String[] args) {
	    
	        
	        Scanner myScanner = new Scanner(System.in);
	        System.out.println("Please enter a number ");
	    
	        
	        
	        try{
	            int num = myScanner.nextInt();
	            System.out.println("your numher is " +num);
	        }
	        catch(InputMismatchException e) {
	            System.out.println("Your Number is  wrong");
	        }
	    }

	}
