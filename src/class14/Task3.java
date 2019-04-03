package class14;

public class Task3 {
	


	    public static void main(String[] args) {
	        //Is it saturday! Is it raining! Do we have a Java Class today?”
	            //    How would you find out how many sentences are in that String?
	        
	       String str="Is it saturday! Is it raining! Do we have a Java Class today?";
	        String gibicik= (str.replaceAll("[A-Za-z]","").replaceAll(" ", ""));
	        System.out.println(gibicik.length());
	    	
	    	
	    	
	    }
	}


