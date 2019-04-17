package class24;


	public class TestEmployees {

		public static void main(String[] args) {
			Employee emp=new Employee();
			FullTimeEmployee ft=new FullTimeEmployee();
			Contracter contractor=new Contracter();
			
			emp.getPaid();//Employee gets paid salary
			ft.getPaid();//Full time employee gets paid salary + bonus
			contractor.getPaid();//Contractor gets paid hourly
		}
	}


