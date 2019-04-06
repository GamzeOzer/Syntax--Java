package class17_2;


	public class NestedLoopDemo {

	    public static void main(String[] args) {
	        
	    	NestedLoopDemo demo= new NestedLoopDemo();
	    	
	    	demo.printNumbers();
	        
	    }
	    
	    
	    
	    void printNumbers() {

	        for (int i=1; i<=2; i++) {
	            
	            for (int y=0; y<=3; y++) {
	                
	                System.out.println(i+" "+y);//10;11;12;13 //20;21;22;23
	                
	            }
	        }
	    }
	}


