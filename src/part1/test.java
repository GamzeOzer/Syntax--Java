package part1;

public class test {

	public static void main(String[] args) {
		EncapsulationDemo obj=new EncapsulationDemo();
	     obj.setAcc_no(7560504000l);
	     obj.setName("Sumair");
	     obj.setEmail("sumair@syntaxsolutions.com");
	     obj.setAmount(500000.0f);
	     
	     System.out.println(obj.getAcc_no()+" "+obj.getName()+" "+obj.getEmail()+" "+ obj.getAmount());
	  }

	}


